package com.sd.driverFactory.factory;

import com.sd.config.enums.RunModeForMobile;
import com.sd.config.enums.RunModeForWeb;
import com.sd.driverFactory.*;
import com.sd.driverFactory.impl.mobile.LocalMobileDriverImpl;
import com.sd.driverFactory.impl.mobile.RemoteMobileDriverImpl;
import com.sd.driverFactory.impl.web.LocalWebDriverImpl;
import com.sd.driverFactory.impl.web.RemoteWebDriverImpl;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory(){};

    /**
     * Using Lambda expressions.
     */
    private static final Map<RunModeForWeb, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeForWeb.class);
    private static final Map<RunModeForMobile, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunModeForMobile.class);

    static {
        WEB.put(RunModeForWeb.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunModeForWeb.REMOTE, RemoteWebDriverImpl::new);
        MOBILE.put(RunModeForMobile.LOCAL, LocalMobileDriverImpl::new);
        MOBILE.put(RunModeForMobile.REMOTE, RemoteMobileDriverImpl::new);
    }

    public static IWebDriver getDriverForWeb(RunModeForWeb runModeForWeb){
        return WEB.get(runModeForWeb).get();
    }

    public static IMobileDriver getDriverForMobile(RunModeForMobile runModeForMObile){
        return MOBILE.get(runModeForMObile).get();
    }


    /**
     * Conventional way of development
     * @param driverDataWeb
     * @return
     */
    /* public static WebDriver getDriverForWeb(DriverDataWeb driverDataWeb){
        return driverDataWeb.getRunModeForWeb() == RunModeForWeb.LOCAL
            ? new LocalWebDriverImpl().getDriver(driverDataWeb)
            : new RemoteWebDriverImpl().getDriver(driverDataWeb);
    }

    public static WebDriver getDriverForMobile(DriverDataMobile driverDataMobile){
        return driverDataMobile.getRunModeForMobile() == RunModeForMobile.LOCAL
            ? new LocalMobileDriverImpl().getDriver(driverDataMobile)
            : new RemoteMobileDriverImpl().getDriver(driverDataMobile);
        } */
}

