package com.sd.mobile.android.androidhooks;

import com.sd.driverFactory.Driver;
import com.sd.driverFactory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidAppHooks {

    @Before(order = 0)
    public void launchAndroidApp() throws InterruptedException {
        Driver.initDriverForMobile();
    }

    @After(order = 0)
    public void closeBrowser(){
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
