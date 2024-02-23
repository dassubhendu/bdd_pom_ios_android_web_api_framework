package com.sd.web.webdataconfig;

import org.aeonbits.owner.ConfigCache;

public class WebDataConfigFactory {

    private WebDataConfigFactory(){};

    public static WebDataConfig getConfig(){
        return ConfigCache.getOrCreate(WebDataConfig.class);
    }

}
