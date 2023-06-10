package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src\\test\\resources\\features"},	
		//glue = {"step_definitions"},
		//tags = {},
		//monochrome = true,
		//dryRun = false,
		//plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
	
		features = {"src/test/resources/features"}, 
		glue = {"step_definitions", "Hooks"}, 
	   //  tags = "@smoke",
              //  {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
	      plugin =  {"pretty", "html:target/cucumber-reports"}
	
	
	
	
)
public class Runner {

}

//Test Automation Framework
//with Cucumber BDD and Page Object Model

