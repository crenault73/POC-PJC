package com.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions"},
        plugin = {"pretty"
                , "html:target/cucumber-reports/report.html"
                , "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        })
public class TestSauceDemoTestRunner {
}
