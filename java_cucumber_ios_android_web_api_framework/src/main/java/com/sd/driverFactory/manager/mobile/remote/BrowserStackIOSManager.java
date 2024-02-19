package com.sd.driverFactory.manager.mobile.remote;

import com.sd.config.FrameworkConfigFactory;
import com.sd.driverFactory.factory.mobile.remote.BrowserStackMobileFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackIOSManager {

    private BrowserStackIOSManager(){};

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        capabilities.setCapability("device", "IOS Device");
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("project", "First Java Project");
        capabilities.setCapability("build", "browserstack-build-1");
        capabilities.setCapability("name", "first_test");
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig()
                .browserStackURL(), capabilities);
    }

}
