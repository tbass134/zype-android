package com.zype.android;

/**
 * Created by Evgeny Cherkasov on 18.03.2017.
 */

public class ZypeSettings {
    // Zype app key
    public static final String APP_KEY = "M2pPt4TrqGweyYlPvX5uRIOIYukvIP3OZzYWpUVr0Q3FVq6VrUuHEH9jH90LJ-s5";
    // OAuth credentials
    public static final String CLIENT_ID = "f97ff3ff1ce1d387c8194e4d0e87b9ba08d05fd1240d2fad56c1fac8489ec4ff";
    // Playlist
    public static final String ROOT_PLAYLIST_ID = "5988733935fdb3138d010dcb";

    // Google Analytics Tracking Id
    public static final String GA_TRACKING_ID = "";

    // Social
    public static final String FACEBOOK_ID = "";
    public static final String INSTAGRAM_ID = "";
    public static final String TWITTER_ID = "";
    public static final String WEB_URL = "";

    // Monetization
    public static final boolean NATIVE_SUBSCRIPTION_ENABLED = false;
    public static final boolean NATIVE_TVOD = true;
    public static final boolean NATIVE_TO_UNIVERSAL_SUBSCRIPTION_ENABLED = false;
    public static final String[] PLAN_IDS = new String[] { "5b366329849e2d140c00002f", "5b366368849e2d141400002b" };
    public static final boolean SUBSCRIBE_TO_WATCH_AD_FREE_ENABLED = false;
    public static final boolean UNIVERSAL_SUBSCRIPTION_ENABLED = false;
    public static final boolean UNIVERSAL_TVOD = true;
    public static final boolean PLAYER_PAYWALL_ENABLED = true;

    // Features
    public static final boolean AUTOPLAY = true;
    public static final boolean BACKGROUND_AUDIO_PLAYBACK_ENABLED = true;
    public static final boolean BACKGROUND_PLAYBACK_ENABLED = false;
    public static final boolean CHROMECAST_SUPPORT = true;
    public static final boolean DEVICE_LINKING = false;
    public static final String DEVICE_LINKING_URL = "https://www.zype.com";
    public static final boolean DOWNLOADS_ENABLED = true;
    public static final boolean DOWNLOADS_ENABLED_FOR_GUESTS = true;
    public static final boolean EPG_ENABLED = false;
    public static final boolean LIBRARY_ENABLED = true;
    public static final boolean PLAYLIST_GALLERY_VIEW = true;
    public static final boolean PLAYLIST_GALLERY_HERO_IMAGES = true;
    public static final boolean PLAYLIST_GALLERY_ITEM_TITLES = false;
    public static final boolean PLAYLIST_GALLERY_ITEM_INLINE_TITLES = true;
    public static final boolean SHARE_VIDEO_ENABLED = false;
    public static final boolean TRAILERS_ENABLED = false;

    // Analytics
    public static final boolean SEGMENT_ANALYTICS = false;
    public static final String SEGMENT_ANALYTICS_WRITE_KEY = "";

    //Live
    public static final boolean SHOW_LIVE = false;
    public static final String LIVE_VIDEO_ID = "5c8faa013bbf420fc200bc40";

    public static final String THEME = ZypeConfiguration.THEME_LIGHT;
}

