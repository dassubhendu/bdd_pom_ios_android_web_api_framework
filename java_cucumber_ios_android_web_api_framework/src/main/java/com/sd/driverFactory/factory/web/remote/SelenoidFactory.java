package com.sd.driverFactory.factory.web.remote;

import com.sd.config.enums.BrowserType;
import com.sd.driverFactory.manager.web.remote.selenoid.SelenoidChromeManager;
import com.sd.driverFactory.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }
}
