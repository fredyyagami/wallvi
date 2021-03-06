package com.arandevs.wallvi;

import com.arandevs.wallvi.utils.Constant;

public class Config {

    //define your hosted file type from Google Drive or Direct JSON Url
    //supported value : Constant.GOOGLE_DRIVE or Constant.JSON_URL
    public static final int JSON_FILE_HOST_TYPE = Constant.JSON_URL;

    //only used if JSON_FILE_HOST_TYPE = Constant.GOOGLE_DRIVE;
    public static final String GOOGLE_DRIVE_JSON_FILE_ID = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

    //only used if json file is stored on Hosting with direct url, JSON_FILE_HOST_TYPE = Constant.JSON_URL
    public static final String JSON_URL = "https://f002.backblazeb2.com/file/netviplus/wallvi/config_json/config.json";

    //default wallpaper columns count for the first time launch, supported value : Constant.WALLPAPER_TWO_COLUMNS or Constant.WALLPAPER_THREE_COLUMNS
    public static final int DEFAULT_WALLPAPER_COLUMN = Constant.WALLPAPER_TWO_COLUMNS;

    //display grid wallpaper style, supported value : Constant.RECTANGLE,  Constant.SQUARE or  Constant.DYNAMIC
    public static final int WALLPAPER_GRID_STYLE = Constant.RECTANGLE;

    //label sorting, supported value : Constant.LABEL_NAME_ASCENDING, Constant.LABEL_NAME_DESCENDING or Constant.LABEL_DEFAULT
    public static final String LABELS_SORTING = Constant.LABEL_NAME_ASCENDING;

    //category columns count, supported value : Constant.GRID_3_COLUMNS or Constant.GRID_2_COLUMNS
    public static final int CATEGORY_COLUMN_COUNT = Constant.GRID_2_COLUMNS;

    //RTL direction, e.g : for Arabic Language
    public static final boolean ENABLE_RTL_MODE = false;

    //GDPR EU Consent
    public static final boolean LEGACY_GDPR = false;

    //Ad Placement in the particular screen, 1 to enable and 0 to disable
    public static final int BANNER_HOME = 1;
    public static final int BANNER_WALLPAPER_DETAIL = 1;
    public static final int BANNER_CATEGORY_DETAIL = 1;
    public static final int BANNER_SEARCH = 1;
    public static final int INTERSTITIAL_WALLPAPER_LIST = 1;
    public static final int INTERSTITIAL_WALLPAPER_DETAIL = 1;
    public static final int NATIVE_AD_WALLPAPER_LIST = 1;

}