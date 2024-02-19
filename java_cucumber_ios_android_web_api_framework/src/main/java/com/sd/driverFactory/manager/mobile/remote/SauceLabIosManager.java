package com.sd.driverFactory.manager.mobile.remote;

import com.sd.config.FrameworkConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabIosManager {

    private SauceLabIosManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("appium:platformVersion", "15.0");
        capabilities.setCapability("appium:deviceName", "iPhone .*");
        capabilities.setCapability("appium:orientation", "portrait");
        capabilities.setCapability("appium:app", "storage:filename=<file-name>");
        DesiredCapabilities sauceOptions = new DesiredCapabilities();
        sauceOptions.setCapability("username", FrameworkConfigFactory.getConfig().sauceLabUsername());
        sauceOptions.setCapability("accessKey", FrameworkConfigFactory.getConfig().sauceLabKey());
        capabilities.setCapability("sauce:options", sauceOptions);
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig()
                .sauceLabURL(), capabilities);
    }

}
