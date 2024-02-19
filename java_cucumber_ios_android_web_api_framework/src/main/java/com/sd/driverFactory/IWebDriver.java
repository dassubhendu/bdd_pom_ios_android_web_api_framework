package com.sd.driverFactory;

import com.sd.driverFactory.entity.DriverDataWeb;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {

    WebDriver getDriver(DriverDataWeb driverDataWeb);

}
