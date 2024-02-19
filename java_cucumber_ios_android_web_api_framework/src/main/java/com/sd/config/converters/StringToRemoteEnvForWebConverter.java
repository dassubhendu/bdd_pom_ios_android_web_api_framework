package com.sd.config.converters;

import com.sd.config.enums.RemoteEnvForWeb;
import com.sd.config.enums.RunModeForWeb;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteEnvForWebConverter implements Converter<RemoteEnvForWeb> {
    @Override
    public RemoteEnvForWeb convert(Method method, String remoteModeWeb) {
        return RemoteEnvForWeb.valueOf(remoteModeWeb.toUpperCase());
    }
}
