package com.sd.mobile.android.androidstepdefinitions;

import com.sd.driverFactory.DriverManager;
import com.sd.mobile.android.androidpages.AndroidAnimationPage;
import com.sd.mobile.android.androidpages.AndroidHomePage;
import com.sd.web.webpages.WebProductsPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AndroidHomeStepDefinitions {

    private AndroidHomePage androidHomePage = new AndroidHomePage((AndroidDriver) DriverManager.getDriver());
    private AndroidAnimationPage androidAnimationPage;
    @Then("Android User will be able to see animation option in home page")
    public void Android_User_will_be_able_to_see_animation_option_in_home_page() throws InterruptedException {
        Assert.assertTrue(androidHomePage.isAnimationIconVisible());
    }

    @Then("Android User clicks on Animation option")
    public void Android_User_clicks_on_Animation_option() throws InterruptedException {
        androidAnimationPage = androidHomePage.clickOnAnimationOption();
    }

}
