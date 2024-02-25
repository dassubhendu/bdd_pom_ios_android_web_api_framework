package com.sd.mobile.ios.iosstepdefinitions;

import com.sd.driverFactory.DriverManager;
import com.sd.mobile.ios.iospages.IOSHomePage;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class IOSHomeStepDefinitions {

    private IOSHomePage iosHomePage = new IOSHomePage((IOSDriver) DriverManager.getDriver());

    @Then("IOS User will be able to see create new task option in home page")
    public void IOS_User_will_be_able_to_see_create_new_task_option_in_home_page() throws InterruptedException {
        Thread.sleep(8000);
        Assert.assertTrue(iosHomePage.isCreateNewTaskRadioBtnVisible());
    }

}
