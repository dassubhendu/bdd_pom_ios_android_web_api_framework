package com.sd.config.converters;

import com.sd.config.enums.BrowserType;
import com.sd.config.enums.RunModeForWeb;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRunModeForWebConverter implements Converter<RunModeForWeb> {
    @Override
    public RunModeForWeb convert(Method method, String runModeWeb) {
        return RunModeForWeb.valueOf(runModeWeb.toUpperCase());
    }
}
