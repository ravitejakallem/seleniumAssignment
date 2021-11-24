package Testrunnerorange;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= "C:\Users\kallemr\eclipse-workspace\com.br.cucumber\src\test\java\features\Orange.feature",
		features= "C:\\Users\\kallemr\\eclipse-workspace\\com.br.cucumber\\src\\test\\java\\features\\Orange2.feature",
		glue= "stepdefinition",
		dryRun= false,
		strict = true,
		monochrome = true,
		format = {"pretty" , "html:test-output"},
		tags = {"@SmokeTest","@RegressionTest"}
		
		)
public class TestRunner {

}
