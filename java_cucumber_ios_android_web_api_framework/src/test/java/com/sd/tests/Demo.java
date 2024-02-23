package com.sd.tests;

import com.sd.config.FrameworkConfigFactory;
import com.sd.driverFactory.Driver;
import com.sd.driverFactory.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Demo {

    @Before
    public void launchBrowser() throws InterruptedException {
        Driver.initDriverForWeb();
    }
    @Test
    public void testLogin() throws InterruptedException {
        System.out.println("Test");
    }
    @After
    public void closeBrowser(){
        Driver.quitDriver();
    }

}
