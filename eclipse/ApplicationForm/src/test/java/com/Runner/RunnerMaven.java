package com.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=   "./src/test/java/com/Feature",
		glue="com.Stepdefinition",
		tags= {"@aboutyou"},
	    plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"}
  )

public class RunnerMaven {
	
}
