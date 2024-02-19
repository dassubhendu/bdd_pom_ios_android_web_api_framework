package com.sd.driverFactory.factory.web.local;

import com.sd.config.enums.BrowserType;
import com.sd.driverFactory.manager.web.local.ChromeManager;
import com.sd.driverFactory.manager.web.local.FirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalWebDriverFactory {

    /**
     * Using Lambda Supplier Interface with functional programming, Stream
     */
    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;

    static {
        MAP.put(BrowserType.CHROME, CHROME);
        MAP.put(BrowserType.FIREFOX, FIREFOX);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }

    private LocalWebDriverFactory(){};

    /**
     * Conventional way of development
     * @param browserType
     * @return
     */
     /* public static WebDriver getDriver(BrowserType browserType){
        return isBrowserChrome(browserType)
                ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    } */

}
