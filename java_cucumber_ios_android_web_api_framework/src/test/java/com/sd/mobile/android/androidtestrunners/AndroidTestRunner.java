package com.sd.mobile.android.androidtestrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = {"com.sd.mobile.android.androidstepdefinitions", "com.sd.mobile.android.androidhooks"},
        tags = "@android_regression",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class AndroidTestRunner {
}
