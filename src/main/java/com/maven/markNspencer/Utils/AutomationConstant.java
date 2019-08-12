package com.maven.markNspencer.Utils;

public class AutomationConstant extends DriverFactory {

    public static final String baseURL="https://www.marksandspencer.com";
    public static final int TimeOut= 20;

    public static final String BROWSER_TYPE = "Chrome";

    //public static final boolean Remote_Browser= true;
    public static final boolean Remote_Browser=false;

    //   public static final String SELENIUM_GRID_URL ="http://localhost:4444/wd/hub";
//new URL("http://YOUR_USERNAME:YOUR_ACCESS_KEY@ondemand.saucelabs.com:80/wd/hub"),

    public static final String SELENIUM_GRID_URL="http://kamol:c667f0dd-e342-4a10-a29b-ae77a0049e90@ondemand.saucelabs.com:80/wd/hub";
}
