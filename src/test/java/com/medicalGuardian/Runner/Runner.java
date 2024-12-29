package com.medicalGuardian.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/medicalGuardian.feature",
        glue="com/medicalGuardian/stepDefinitions",
        dryRun = false,
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)

public class Runner {
}
