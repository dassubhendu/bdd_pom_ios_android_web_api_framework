package com.sd.driverFactory.entity;

import com.sd.config.enums.BrowserType;
import com.sd.config.enums.RemoteEnvForWeb;
import com.sd.config.enums.RunModeForWeb;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DriverDataWeb {

    private BrowserType browserType;
    private RemoteEnvForWeb remoteEnvForWeb;

}
