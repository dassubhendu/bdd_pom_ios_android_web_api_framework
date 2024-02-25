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
    @Key("${browserName}.browser")
    BrowserType browser();

    @DefaultValue("LOCAL")
    @ConverterClass(StringToRunModeForWebConverter.class)
    @Key("${runModeForWeb}.runModeForWeb")
    RunModeForWeb runModeForWeb();
    @DefaultValue("SELENOID")
    @ConverterClass(StringToRemoteEnvForWebConverter.class)
    @Key("${remoteEnvForWeb}.remoteEnvForWeb")
    RemoteEnvForWeb remoteEnvForWeb();

    @DefaultValue("ANDROID")
    @ConverterClass(StringToMobileOSPlatformTypeConverter.class)
    @Key("${mobileOSPlatform}.mobileOSPlatform")
    MobileOSPlatformType mobileOSPlatform();

    @DefaultValue("LOCAL")
    @ConverterClass(StringToRunModeForMobileConverter.class)
    @Key("${runModeForMobile}.runModeForMobile")
    RunModeForMobile runModeForMobile();

    @DefaultValue("SAUCELAB")
    @ConverterClass(StringToRemoteEnvForMobileConverter.class)
    @Key("${remoteEnvForMobile}.remoteEnvForMobile")
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
