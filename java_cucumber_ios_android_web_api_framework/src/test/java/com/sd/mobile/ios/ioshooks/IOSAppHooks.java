package com.sd.mobile.ios.ioshooks;

import com.sd.driverFactory.Driver;
import com.sd.driverFactory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class IOSAppHooks {

    @Before(order = 0)
    public void launchIOSApp() throws InterruptedException {
        Driver.initDriverForMobile();
    }

    @After(order = 0)
    public void closeApp(){
        Driver.quitDriver();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenShotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenShotName);
        }
    }


}
