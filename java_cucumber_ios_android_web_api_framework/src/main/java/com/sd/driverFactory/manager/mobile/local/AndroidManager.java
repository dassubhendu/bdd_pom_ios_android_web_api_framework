package com.sd.driverFactory.manager.mobile.local;

import com.sd.config.FrameworkConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;

public final class AndroidManager {

    private AndroidManager(){};

    public static WebDriver getDriver(){
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir") + "/mobileApps/android-app.apk");
        return new AndroidDriver(FrameworkConfigFactory.getConfig().localAppiumServerURL(), options);
    }

}
