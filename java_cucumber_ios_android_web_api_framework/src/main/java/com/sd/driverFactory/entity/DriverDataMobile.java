package com.sd.driverFactory.entity;

import com.sd.config.enums.MobileOSPlatformType;
import com.sd.config.enums.RemoteEnvForMobile;
import com.sd.config.enums.RunModeForMobile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DriverDataMobile {

    private MobileOSPlatformType mobileOSPlatformType;
    private RemoteEnvForMobile remoteEnvForMobile;


}
