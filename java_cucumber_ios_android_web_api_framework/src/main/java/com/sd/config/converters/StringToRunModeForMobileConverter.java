package com.sd.config.converters;

import com.sd.config.enums.RunModeForMobile;
import com.sd.config.enums.RunModeForWeb;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeForMobileConverter implements Converter<RunModeForMobile> {
    @Override
    public RunModeForMobile convert(Method method, String runModeWeb) {
        return RunModeForMobile.valueOf(runModeWeb.toUpperCase());
    }
}
