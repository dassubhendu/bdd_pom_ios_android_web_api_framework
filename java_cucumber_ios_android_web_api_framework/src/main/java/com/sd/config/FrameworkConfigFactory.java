package com.sd.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;

public class FrameworkConfigFactory {

    private FrameworkConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }

}
