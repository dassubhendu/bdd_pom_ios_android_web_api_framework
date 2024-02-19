package com.sd.driverFactory.impl.mobile;

import com.sd.driverFactory.IMobileDriver;
import com.sd.driverFactory.entity.DriverDataMobile;
import com.sd.driverFactory.entity.DriverDataWeb;
import com.sd.driverFactory.factory.mobile.remote.RemoteMobileDriverFactory;
import com.sd.driverFactory.factory.web.remote.RemoteWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(DriverDataMobile driverDataMobile) {
        return RemoteMobileDriverFactory.getDriver(driverDataMobile.getRemoteEnvForMobile(), driverDataMobile.getMobileOSPlatformType());
    }
}
