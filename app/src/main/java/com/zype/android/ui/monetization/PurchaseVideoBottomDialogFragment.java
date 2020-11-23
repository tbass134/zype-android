package com.zype.android.ui.monetization;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zype.android.Auth.AuthHelper;
import com.zype.android.Db.Entity.Playlist;
import com.zype.android.databinding.FragmentPaywallPlaylistTvodBinding;
import com.zype.android.databinding.FragmentPurchaseVideoBinding;
import com.zype.android.ui.NavigationHelper;
import com.zype.android.ui.video_details.VideoDetailViewModel;

public class PurchaseVideoBottomDialogFragment extends BottomSheetDialogFragment {
    public static final String TAG = PurchaseVideoBottomDialogFragment.class.getSimpleName();

    private PaywallViewModel model;
    private VideoDetailViewModel videoDetailViewModel;

    private FragmentPurchaseVideoBinding binding;

    public PurchaseVideoBottomDialogFragment() {}

    public static PurchaseVideoBottomDialogFragment getInstance() {
        PurchaseVideoBottomDialogFragment fragment = new PurchaseVideoBottomDialogFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPurchaseVideoBinding.inflate(inflater, container, false);
        binding.setIsReview(true);
        binding.setIsPurchaseCompleted(false);
        binding.buttonBack.setOnClickListener(v -> {
            dismiss();
        });
        binding.buttonBuyVideo.setOnClickListener(v -> {
            if (model.getSelectedItem() == null) {
                Log.e(TAG, "buttonBuyVideo::onClick(): No item selected for purchase");
                return;
            }
            model.makePurchase(getActivity(), model.getSelectedItem());
        });
        binding.buttonPlay.setOnClickListener(v -> {
            dismiss();
        });
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        model = ViewModelProviders.of(this).get(PaywallViewModel.class);
        model.setPaywallType(PaywallType.VIDEO_TVOD);
        // This fragment assumes that we made sure user is signed in
        model.setState(PaywallViewModel.State.SIGNED_IN);
        model.getState().observe(this, state -> {
            Log.d(TAG, "PaywallVideModel::getState(): state=" + state);
            switch (state) {
                case SIGNED_IN:
                    model.getPurchaseItems().observe(this, purchaseItems -> {
                        if (purchaseItems != null && !purchaseItems.isEmpty()) {
                            model.setState(PaywallViewModel.State.READY_FOR_PURCHASE);
                        }
                        else {
                            model.setState(PaywallViewModel.State.SIGNED_IN);
                        }
                    });
                    break;
                case READY_FOR_PURCHASE:
                    binding.setIsReadyForPurchase(true);
                    break;
                case PURCHASE_COMPLETED:
                    binding.setIsReadyForPurchase(false);
                    binding.setIsPurchaseCompleted(true);
                    break;
                default:
                    Log.d(TAG, "PaywallVideModel::getState(): Unknown state");
                    break;
            }
        });

        videoDetailViewModel = ViewModelProviders.of(getActivity()).get(VideoDetailViewModel.class);
        videoDetailViewModel.getVideo().observe(this, video -> {
            if (video != null) {
                model.setVideoId(video.id);
                binding.setVideoPrice(video.purchasePrice);
                binding.setVideoTitle(video.title);
            }
        });
    }
}
