package com.sd.driverFactory.manager.mobile.local;

import com.sd.config.FrameworkConfigFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;

public final class IOSManager {

    private IOSManager(){};

    public static WebDriver getDriver(){
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 14")
                .setApp(System.getProperty("user.dir") + "/mobileApps/ios-app.zip");
        return new IOSDriver(FrameworkConfigFactory.getConfig().localAppiumServerURL(), options);
    }

}
