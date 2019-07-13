package com.toollist.safebear.co.uk.toollis;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature//goToFrame.feature", glue = "stepDefinition", monochrome = true, // display the console in a proper
																					// readable format
		strict = true
		//,dryRun = true
		, plugin = { "pretty", "html:target/htmlreports" }
		//tags = {"@Smoke"}

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
