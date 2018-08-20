package com.zype.android;

/**
 * Created by Evgeny Cherkasov on 18.03.2017.
 */

public class ZypeSettings {
    // Zype app key
    public static final String APP_KEY = "<APP_KEY>";
    // OAuth credentials
    public static final String CLIENT_ID = "<CLIENT_ID>";
//    public static final String CLIENT_SECRET = "<CLIENT_SECRET>";
    // Playlist
    public static final String ROOT_PLAYLIST_ID = "<ROOT_PLAYLIST_ID>";

    // Google Analytics Tracking Id
    // TODO: To use Google Analytics provide your GA tracking id
    public static final String GA_TRACKING_ID = "";

    // Social
    // TODO: Add your real social network ids and web url
    public static final String FACEBOOK_ID = "";
    public static final String INSTAGRAM_ID = "";
    public static final String TWITTER_ID = "";
    public static final String WEB_URL = "";

    // Monetization
    public static final boolean NATIVE_SUBSCRIPTION_ENABLED = Boolean.valueOf("<NATIVE_SUBSCRIPTION_ENABLED>");
    public static final boolean NATIVE_TO_UNIVERSAL_SUBSCRIPTION_ENABLED = Boolean.valueOf("<NATIVE_TO_UNIVERSAL_SUBSCRIPTION_ENABLED>");
    public static final String[] PLAN_IDS = new String[] { <PLAN_IDS> };
    public static final boolean SUBSCRIBE_TO_WATCH_AD_FREE_ENABLED = Boolean.valueOf("<SUBSCRIBE_TO_WATCH_AD_FREE_ENABLED>");
    public static final boolean UNIVERSAL_SUBSCRIPTION_ENABLED = Boolean.valueOf("<UNIVERSAL_SUBSCRIPTION_ENABLED>");
    public static final boolean UNIVERSAL_TVOD = Boolean.valueOf("<UNIVERSAL_TVOD>");

    // Features
    public static final boolean AUTOPLAY = Boolean.valueOf("<AUTOPLAY>");
    public static final boolean BACKGROUND_AUDIO_PLAYBACK_ENABLED = Boolean.valueOf("BACKGROUND_AUDIO_PLAYBACK_ENABLED");
    public static final boolean BACKGROUND_PLAYBACK_ENABLED = Boolean.valueOf("<BACKGROUND_PLAYBACK_ENABLED>");
    public static final boolean DEVICE_LINKING = Boolean.valueOf("<DEVICE_LINKING>");
    public static final String DEVICE_LINKING_URL = "<DEVICE_LINKING_URL>";
    public static final boolean DOWNLOADS_ENABLED = Boolean.valueOf("<DOWNLOADS_ENABLED>");
    public static final boolean DOWNLOADS_ENABLED_FOR_GUESTS = Boolean.valueOf("<DOWNLOADS_ENABLED_FOR_GUESTS>");

    // Following options are not supported by platform app builder.
    public static final boolean PLAYLIST_GALLERY_VIEW = false;
    public static final boolean PLAYLIST_GALLERY_HERO_IMAGES = false;
    public static final boolean PLAYLIST_GALLERY_ITEM_TITLES = false;
    public static final boolean SHARE_VIDEO_ENABLED = false;

    /**
     * Theme of the app.
     * Use following constants for the theme:
     * @see ZypeConfiguration#THEME_LIGHT
     * @see ZypeConfiguration#THEME_DARK
     */
    public static final String THEME = "<THEME>";

}

