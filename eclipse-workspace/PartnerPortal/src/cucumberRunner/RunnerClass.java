package cucumberRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C://Users//Sruthi.Kundoor//eclipse-workspace//PartnerPortal//src//com//Feature",
		glue= {"com.StepDefination"},
		tags= {"~@Courseonline","@ProductProgression","~@newoutcome","~@Entryrequirementsremoving","~@Entryrequirementsadding"},
		plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"}
		)

public class RunnerClass {
	
}
