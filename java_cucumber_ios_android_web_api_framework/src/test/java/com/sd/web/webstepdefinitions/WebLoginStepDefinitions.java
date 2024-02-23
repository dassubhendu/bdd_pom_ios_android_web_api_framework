package com.sd.web.webstepdefinitions;

import com.sd.driverFactory.DriverManager;
import com.sd.web.webdataconfig.WebDataConfigFactory;
import com.sd.web.webpages.WebLoginPage;
import com.sd.web.webpages.WebProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WebLoginStepDefinitions {

    private WebLoginPage webLoginPage = new WebLoginPage(DriverManager.getDriver());
    private WebProductsPage webProductsPage;

    @Given("User is in Login Page")
    public void user_is_in_login_page() throws InterruptedException {
        DriverManager.getDriver().get(WebDataConfigFactory.getConfig().appURL());
        Thread.sleep(6000);
    }

    @Then("^User enters valid username and password$")
    public void user_enters_valid_username_and_password() throws Throwable {
        webLoginPage.enterUsername(WebDataConfigFactory.getConfig().validUsername());
        webLoginPage.enterPassword(WebDataConfigFactory.getConfig().validPassword());
    }

    @And("^Click on the login button$")
    public void click_on_the_login_button() throws Throwable {
        webProductsPage = webLoginPage.clickLoginButton();
        Thread.sleep(8000);
    }

    @Then("^User will be able to login successfully$")
    public void user_will_be_able_to_login_successfully() throws Throwable {
        Assert.assertTrue(webProductsPage.isProductsCaptionVisible());
    }

    @Then("^User enters invalid username and password$")
    public void user_enters_invalid_username_and_password() throws Throwable {
        webLoginPage.enterUsername(WebDataConfigFactory.getConfig().invalidUsername());
        webLoginPage.enterPassword(WebDataConfigFactory.getConfig().invalidPassword());
    }

    @Then("^User will not be able to login$")
    public void user_will_not_be_able_to_login() throws Throwable {
        Assert.assertTrue(webLoginPage.isErrorMsgVisibleForInvalidCred());
    }

}
