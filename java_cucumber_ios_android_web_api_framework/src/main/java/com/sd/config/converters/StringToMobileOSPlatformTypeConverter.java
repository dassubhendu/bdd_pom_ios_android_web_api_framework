package com.sd.config.converters;

import com.sd.config.enums.MobileOSPlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileOSPlatformTypeConverter implements Converter<MobileOSPlatformType> {
    @Override
    public MobileOSPlatformType convert(Method method, String mobileOSPlatformType) {
        return MobileOSPlatformType.valueOf(mobileOSPlatformType.toUpperCase());
    }
}
