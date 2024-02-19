package com.sd.driverFactory.factory.mobile.remote;

import com.sd.config.enums.MobileOSPlatformType;
import com.sd.driverFactory.manager.mobile.remote.BrowserStackAndroidManager;
import com.sd.driverFactory.manager.mobile.remote.BrowserStackIOSManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

    private BrowserStackMobileFactory(){};

    private static final Map<MobileOSPlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobileOSPlatformType.class);

    static {
        MAP.put(MobileOSPlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobileOSPlatformType.IOS, BrowserStackIOSManager::getDriver);
    }

    public static WebDriver getDriver(MobileOSPlatformType mobileOSPlatformType){
        return MAP.get(mobileOSPlatformType).get();
    }

}
