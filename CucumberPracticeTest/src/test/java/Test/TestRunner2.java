package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "@rerun/failed_scenarios.txt" },  glue = {
		"pg.demo", "Test" }, plugin = { "pretty",
				"json:target/cucumber-reports/Cucumber2.json" }, monochrome = true)

public class TestRunner2 extends AbstractTestNGCucumberTests {

	
}