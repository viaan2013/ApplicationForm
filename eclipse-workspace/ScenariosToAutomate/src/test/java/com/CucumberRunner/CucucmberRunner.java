package com.CucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C://Users//Sruthi.Kundoor//eclipse-workspace//ScenariosToAutomate//src//test//resources//features",
		glue= {"com.StepDefination"},
		tags= {"~@Courseonline","@ProductProgression","~@Newoutcome","~@RemovingEntryrequirements","~@AddingEntryrequirements"},
		plugin= {"pretty",
				"html:target/cucumber-html-report",
				"json:target/cucumber.json"}
		)


public class CucucmberRunner {
	
	

}
