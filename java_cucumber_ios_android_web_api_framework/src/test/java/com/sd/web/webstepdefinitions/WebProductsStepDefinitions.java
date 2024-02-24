package com.sd.web.webstepdefinitions;

import com.sd.driverFactory.DriverManager;
import com.sd.web.webpages.WebLoginPage;
import com.sd.web.webpages.WebProductsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WebProductsStepDefinitions {

    private WebProductsPage webProductsPage = new WebProductsPage(DriverManager.getDriver());
    @Then("User will be able to see the cart icon")
    public void user_will_be_able_to_see_the_cart_icon() {
        Assert.assertTrue(webProductsPage.isCartIconVisible());
    }

    @Then("User will be able to see the product filter option")
    public void User_will_be_able_to_see_the_product_filter_option() {
        Assert.assertTrue(webProductsPage.isProductFilterOptionVisible());
    }



}
