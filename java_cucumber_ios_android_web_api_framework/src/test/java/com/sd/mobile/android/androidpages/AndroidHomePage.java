package com.sd.mobile.android.androidpages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidHomePage {

    private AndroidDriver driver;

    private static final By ANIMATION_ICON = AppiumBy.accessibilityId("Animation");
    public AndroidHomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public boolean isAnimationIconVisible() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(ANIMATION_ICON).isDisplayed();
    }

    public AndroidAnimationPage clickOnAnimationOption(){
        driver.findElement(ANIMATION_ICON).click();
        return new AndroidAnimationPage(this.driver);
    }


}
