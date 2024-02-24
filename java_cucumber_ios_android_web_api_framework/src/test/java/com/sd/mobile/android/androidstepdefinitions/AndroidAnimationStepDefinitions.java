package com.sd.mobile.android.androidstepdefinitions;

import com.sd.driverFactory.DriverManager;
import com.sd.mobile.android.androidpages.AndroidAnimationPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AndroidAnimationStepDefinitions {

    private AndroidAnimationPage androidAnimationPage = new AndroidAnimationPage((AndroidDriver) DriverManager.getDriver());
    @Then("Android User will be able to see cloning option")
    public void Android_User_will_be_able_to_see_cloning_option() throws InterruptedException {
        Assert.assertTrue(androidAnimationPage.isCloningOptionVisible());
    }

}
