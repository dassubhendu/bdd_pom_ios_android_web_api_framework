package com.sd.driverFactory;

import com.sd.config.FrameworkConfigFactory;
import com.sd.config.enums.MobileOSPlatformType;
import com.sd.driverFactory.entity.DriverDataMobile;
import com.sd.driverFactory.entity.DriverDataWeb;
import com.sd.driverFactory.factory.DriverFactory;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){};

    public static void initDriverForWeb() throws InterruptedException {
        if(Objects.isNull(DriverManager.getDriver())) {
            DriverDataWeb driverDataWeb = new DriverDataWeb(FrameworkConfigFactory.getConfig().browser(), FrameworkConfigFactory.getConfig().remoteEnvForWeb());
            WebDriver driver = DriverFactory.getDriverForWeb(FrameworkConfigFactory.getConfig().runModeForWeb()).getDriver(driverDataWeb);
            DriverManager.setDriver(driver);
        }
    }

    public static void initDriverForMobile() throws InterruptedException {
        DriverDataMobile driverDataMobile = new DriverDataMobile(FrameworkConfigFactory.getConfig().mobileOSPlatform(), FrameworkConfigFactory.getConfig().remoteEnvForMobile());
        WebDriver driver = DriverFactory.getDriverForMobile(FrameworkConfigFactory.getConfig().runModeForMobile()).getDriver(driverDataMobile);
        DriverManager.setDriver(driver);
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }


}
