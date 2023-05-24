package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/FeatureFiles/actitimeLogin.feature",
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty", "html:test-output.html"},
		monochrome = true
		)
public class TestRunnerLogin {
	
}
