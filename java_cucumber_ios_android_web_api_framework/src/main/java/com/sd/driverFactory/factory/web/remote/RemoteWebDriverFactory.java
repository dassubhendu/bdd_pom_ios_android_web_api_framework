package com.sd.driverFactory.factory.web.remote;

import com.sd.config.enums.BrowserType;
import com.sd.config.enums.RemoteEnvForWeb;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteWebDriverFactory {

    private RemoteWebDriverFactory(){};

    /**
     * Using Lambda and Stream
     */
    private static final Map<RemoteEnvForWeb, Function<BrowserType, WebDriver>> MAP = new EnumMap<>(RemoteEnvForWeb.class);
    private static final Function<BrowserType, WebDriver> SELENOID = SelenoidFactory::getDriver;
    private static final Function<BrowserType, WebDriver> BROWSER_STACK = BrowserStackFactory::getDriver;

    static {
        MAP.put(RemoteEnvForWeb.SELENOID, SELENOID);
        MAP.put(RemoteEnvForWeb.BROWSER_STACK, BROWSER_STACK);
    }

    public static WebDriver getDriver(RemoteEnvForWeb remoteEnvForWeb, BrowserType browserType){
        return MAP.get(remoteEnvForWeb).apply(browserType);
    }

    /**
     * Conventional way of development
     * @param remoteEnvForWeb
     * @param browserType
     * @return
     */
    /* public static WebDriver getDriver(RemoteEnvForWeb remoteEnvForWeb, BrowserType browserType){

        if(remoteEnvForWeb == RemoteEnvForWeb.SELENOID){
            return SelenoidFactory.getDriver(browserType);
        }else if(remoteEnvForWeb == RemoteEnvForWeb.SELENIUM){
            System.out.println("Under Development");
        }
        return null;
    } */

}
