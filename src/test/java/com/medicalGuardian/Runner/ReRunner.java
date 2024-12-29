package com.medicalGuardian.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/uiFailedTests.txt",
        glue = "com/medicalGuardian/stepDefinitions",
        dryRun = true,
        plugin = {"pretty","html:target/uiReport.html"}


)
public class ReRunner {
}
