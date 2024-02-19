package com.sd.driverFactory.impl.mobile;

import com.sd.driverFactory.IMobileDriver;
import com.sd.driverFactory.entity.DriverDataMobile;
import com.sd.driverFactory.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(DriverDataMobile driverDataMobile) {
        return LocalMobileDriverFactory.getDriver(driverDataMobile.getMobileOSPlatformType());
    }
}
