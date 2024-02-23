package com.sd.web.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebLoginPage {

    private  WebDriver driver;

    private static final By USERNAME = By.id("user-name");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MSG_INVALID_LOGIN_CRED = By.xpath("//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]");

    public WebLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        this.driver.findElement(USERNAME).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public boolean isErrorMsgVisibleForInvalidCred(){
        return driver.findElement(ERROR_MSG_INVALID_LOGIN_CRED).isDisplayed();
    }

    public WebProductsPage clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
        return new WebProductsPage(this.driver);
    }

}
