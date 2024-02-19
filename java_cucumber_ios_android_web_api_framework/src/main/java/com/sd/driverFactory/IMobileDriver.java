package com.sd.driverFactory;

import com.sd.driverFactory.entity.DriverDataMobile;
import com.sd.driverFactory.entity.DriverDataWeb;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {

    WebDriver getDriver(DriverDataMobile driverDataMobile);

}
