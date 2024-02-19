package com.sd.config.converters;

import com.sd.config.enums.RemoteEnvForMobile;
import com.sd.config.enums.RemoteEnvForWeb;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteEnvForMobileConverter implements Converter<RemoteEnvForMobile> {
    @Override
    public RemoteEnvForMobile convert(Method method, String remoteModeWeb) {
        return RemoteEnvForMobile.valueOf(remoteModeWeb.toUpperCase());
    }
}
