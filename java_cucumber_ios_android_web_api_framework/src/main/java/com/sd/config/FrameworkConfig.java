package com.sd.config;

import com.sd.config.converters.*;
import com.sd.config.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/testdata/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeForWeb")
    @ConverterClass(StringToRunModeForWebConverter.class)
    RunModeForWeb runModeForWeb();

    @Key("remoteEnvForWeb")
    @ConverterClass(StringToRemoteEnvForWebConverter.class)
    RemoteEnvForWeb remoteEnvForWeb();

    @Key("runModeForMobile")
    @ConverterClass(StringToRunModeForMobileConverter.class)
    RunModeForMobile runModeForMobile();

    @Key("remoteEnvForMobile")
    @ConverterClass(StringToRemoteEnvForMobileConverter.class)
    RemoteEnvForMobile remoteEnvForMobile();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();

    /**
     * BrowserStack URL construction
     */
    @Key("browserStackUsername")
    String browserStackUsername();

    @Key("browserStackKey")
    String browserStackKey();

    @DefaultValue("https://${browserStackUsername}:${browserStackKey}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();

    /**
     * SauceLab URL construction
     */
    @Key("sauceLabUsername")
    String sauceLabUsername();

    @Key("sauceLabKey")
    String sauceLabKey();

    @DefaultValue("https://${sauceLabUsername}:${sauceLabKey}@hub-cloud.saucelab.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL sauceLabURL();



}
