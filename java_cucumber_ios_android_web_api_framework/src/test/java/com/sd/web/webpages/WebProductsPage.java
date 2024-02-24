package com.sd.web.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebProductsPage {

    private WebDriver driver;

    private static final By PRODUCTS_CAPTION = By.xpath("//span[contains(text(), 'Products')]");
    private static final By CART_ICON = By.xpath("//a[@class='shopping_cart_link']");
    private static final By PRODUCT_FILTER_OPTION = By.xpath("//select[@class='product_sort_container']");

    public WebProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isProductsCaptionVisible(){
        return this.driver.findElement(PRODUCTS_CAPTION).isDisplayed();
    }

    public boolean isCartIconVisible(){
        return this.driver.findElement(CART_ICON).isDisplayed();
    }

    public boolean isProductFilterOptionVisible(){
        return this.driver.findElement(PRODUCT_FILTER_OPTION).isDisplayed();
    }

}
