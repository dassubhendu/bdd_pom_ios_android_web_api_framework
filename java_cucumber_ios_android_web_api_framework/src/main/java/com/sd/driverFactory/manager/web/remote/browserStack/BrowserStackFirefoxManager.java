package com.sd.driverFactory.manager.web.remote.browserStack;

import com.sd.config.FrameworkConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackFirefoxManager {

    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browser", "firefox");
        capabilities.setCapability("browser_version", "latest");
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "10");
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig()
                .browserStackURL(), capabilities);
    }

}
