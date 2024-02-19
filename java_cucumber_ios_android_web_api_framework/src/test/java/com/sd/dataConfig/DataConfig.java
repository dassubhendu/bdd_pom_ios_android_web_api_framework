package com.sd.dataConfig;

import com.sd.config.converters.StringToBrowserTypeConverter;
import com.sd.config.enums.BrowserType;
import org.aeonbits.owner.Config;

/**
 * 'DataConfig' interface has been created and 'Config' interface has been extended from Owner
 * library.
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/testdata_QA.properties"
})
public interface DataConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();


}
