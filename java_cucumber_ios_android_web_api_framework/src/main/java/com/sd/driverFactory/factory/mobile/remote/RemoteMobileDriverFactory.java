package com.sd.driverFactory.factory.mobile.remote;

import com.sd.config.enums.MobileOSPlatformType;
import com.sd.config.enums.RemoteEnvForMobile;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){};

    private static final Map<RemoteEnvForMobile, Function<MobileOSPlatformType, WebDriver>> MAP =
            new EnumMap<>(RemoteEnvForMobile.class);

    static {
        MAP.put(RemoteEnvForMobile.SAUCELAB, SauceLabMobileFactory::getDriver);
        MAP.put(RemoteEnvForMobile.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(RemoteEnvForMobile remoteEnvForMobile, MobileOSPlatformType mobileOSPlatformType){
        return MAP.get(remoteEnvForMobile).apply(mobileOSPlatformType);
    }


}
