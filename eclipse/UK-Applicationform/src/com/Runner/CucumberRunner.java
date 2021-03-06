package com.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=   "./src/com/feature",
		glue="com.stepdefinition",
		tags= {"@CourseDetails"},
		plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"}
  )
public class CucumberRunner {

}