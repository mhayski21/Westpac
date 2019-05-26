package testRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reports/report.html" },
		//plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
		features = "src/test/resources/feature",
		// format = {"html:target/cucumber-html-report"}
		glue = { "stepDefinition" }, tags = { "@UATTest" },
		 plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-" + "report.json"},
		monochrome = true)

@Test
public class TestRunnerKiwiSaverCalculator extends AbstractTestNGCucumberTests {
	

}
