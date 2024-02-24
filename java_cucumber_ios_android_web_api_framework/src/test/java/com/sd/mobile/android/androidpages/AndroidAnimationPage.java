package com.sd.mobile.android.androidpages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AndroidAnimationPage {

    private AndroidDriver driver;

    private static final By CLONING_ICON = AppiumBy.accessibilityId("Cloning");
    public AndroidAnimationPage(AndroidDriver driver){
        this.driver = driver;
    }

    public boolean isCloningOptionVisible(){
        return driver.findElement(CLONING_ICON).isDisplayed();
    }

}
