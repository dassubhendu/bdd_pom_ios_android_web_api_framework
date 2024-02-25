package com.sd.mobile.ios.iospages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class IOSHomePage {

    private IOSDriver driver;

    private static final By CREATE_NEW_TASK = AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Create new task']");

    public IOSHomePage(IOSDriver driver){
        this.driver = driver;
    }

    public boolean isCreateNewTaskRadioBtnVisible() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(CREATE_NEW_TASK).isDisplayed();
    }

}
