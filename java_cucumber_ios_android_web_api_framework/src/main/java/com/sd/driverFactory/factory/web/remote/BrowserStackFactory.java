package com.sd.driverFactory.factory.web.remote;

import com.sd.config.enums.BrowserType;
import com.sd.driverFactory.manager.web.remote.browserStack.BrowserStackChromeManager;
import com.sd.driverFactory.manager.web.remote.browserStack.BrowserStackFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }

}
