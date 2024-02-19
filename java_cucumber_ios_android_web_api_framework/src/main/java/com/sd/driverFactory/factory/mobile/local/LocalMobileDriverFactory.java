package com.sd.driverFactory.factory.mobile.local;

import com.sd.config.enums.MobileOSPlatformType;
import com.sd.driverFactory.manager.mobile.local.AndroidManager;
import com.sd.driverFactory.manager.mobile.local.IOSManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){};

    private static final Map<MobileOSPlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobileOSPlatformType.class);

    static {
        MAP.put(MobileOSPlatformType.IOS, IOSManager::getDriver);
        MAP.put(MobileOSPlatformType.ANDROID, AndroidManager::getDriver);
    }

    public static WebDriver getDriver(MobileOSPlatformType mobileOSPlatformType){
        return MAP.get(mobileOSPlatformType).get();
    }

}
