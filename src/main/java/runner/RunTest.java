package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src//main//java//features"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty","json:target/cucumber.json"}
					
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

	//, tags ="@appium"
	//html:target/cucumber
	//json:target/cucumber.json
}
