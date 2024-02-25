package com.sd.mobile.ios.iostestrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = {"com.sd.mobile.ios.iosstepdefinitions", "com.sd.mobile.ios.ioshooks"},
        tags = "@ios_regression",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class IOSTestRunner {
}
