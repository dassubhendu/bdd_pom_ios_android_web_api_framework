package com.sd.driverFactory.impl.web;

import com.sd.driverFactory.IWebDriver;
import com.sd.driverFactory.entity.DriverDataWeb;
import com.sd.driverFactory.factory.web.local.LocalWebDriverFactory;
import com.sd.driverFactory.factory.web.remote.RemoteWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(DriverDataWeb driverDataWeb) {
        return RemoteWebDriverFactory.getDriver(driverDataWeb.getRemoteEnvForWeb(), driverDataWeb.getBrowserType());
    }
}
