package com.sd.driverFactory.factory.mobile.remote;

import com.sd.config.enums.MobileOSPlatformType;
import com.sd.driverFactory.manager.mobile.remote.SauceLabAndroidManager;
import com.sd.driverFactory.manager.mobile.remote.SauceLabIosManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SauceLabMobileFactory {

    private SauceLabMobileFactory() {
    }

    private static final Map<MobileOSPlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobileOSPlatformType.class);

    static {
        MAP.put(MobileOSPlatformType.ANDROID, SauceLabAndroidManager::getDriver);
        MAP.put(MobileOSPlatformType.IOS, SauceLabIosManager::getDriver);
    }

    public static WebDriver getDriver(MobileOSPlatformType mobileOSPlatformType) {
        return MAP.get(mobileOSPlatformType).get();
    }

}
