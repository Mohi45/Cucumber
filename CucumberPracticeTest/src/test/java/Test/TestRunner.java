package Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/Feature" }, glue = { "pg.demo", "Test" }, plugin = {
		"json:target/cucumber-reports/Cucumber.json", "rerun:rerun/failed_scenarios.txt" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	BaseClass base = new BaseClass();

	@Before
	public void init(Scenario scenario) {
		System.out.println("Hello TestRunner");
		base.initialiseBrowser();

		/*
		 * String scenarioId=scenario.getId(); int
		 * start=scenarioId.indexOf(File.separator+"features"+File.separator); int
		 * end=scenarioId.indexOf(".");
		 * 
		 * String[]
		 * featureName=scenarioId.substring(start,end).split(File.separator+"features"+
		 * File.separator); System.out.println("featureName ="+featureName[1]);
		 */

		System.out.println(" Scenario name is " + scenario.getName());
		System.out.println(" Scenario id is " + scenario.getId());

	}

	@After
	public void tear(Scenario scenario) {
		base.takeScreenshot(scenario);
		base.closeBrowser();

	}

}
