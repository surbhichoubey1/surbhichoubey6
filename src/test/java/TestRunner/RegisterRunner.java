package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features="FeatureFile",glue= {"StepDefinition"},tags="@login", plugin= {"pretty","json:target/cucumber.json"}
		)
public class RegisterRunner
{
	}
