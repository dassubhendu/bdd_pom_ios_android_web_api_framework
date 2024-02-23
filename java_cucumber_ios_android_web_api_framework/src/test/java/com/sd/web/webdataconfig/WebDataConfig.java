package com.sd.web.webdataconfig;

import org.aeonbits.owner.Config;

/**
 * 'WebDataConfig' interface has been created and 'Config' interface has been extended from Owner
 * library.
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:testdata/${env}.properties",
        "file:${user.dir}/src/test/resources/testdata/web/QA.properties"
})
public interface WebDataConfig extends Config {

    @DefaultValue("https://www.saucedemo.com/")
    @Key("appURL")
    String appURL();

    @Key("validUsername")
    String validUsername();

    @Key("validPassword")
    String validPassword();

    @Key("invalidUsername")
    String invalidUsername();

    @Key("invalidPassword")
    String invalidPassword();


}
