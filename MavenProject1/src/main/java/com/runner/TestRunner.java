package com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\java\\com\\features",
		glue="com.stepdef",
		dryRun=false,
		monochrome=true,
		plugin="html:target"
		)


public class TestRunner {

}
