package com.sd.driverFactory.impl.web;

import com.sd.driverFactory.IWebDriver;
import com.sd.driverFactory.entity.DriverDataWeb;
import com.sd.driverFactory.factory.web.local.LocalWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(DriverDataWeb driverDataWeb) {
        return LocalWebDriverFactory.getDriver(driverDataWeb.getBrowserType());
    }
}
