package com.zype.android.core.bus;

import android.os.Handler;
import android.os.Looper;

import com.squareup.otto.Bus;

public class EventBus extends Bus {

    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    public void post(final Object event) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.post(event);
        } else {
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    post(event);
                }
            });
        }
    }
}
