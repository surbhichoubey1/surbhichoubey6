package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features="FeatureFile",glue= {"StepDefinition"},tags="@login"
		)
public class RegisterRunner
{
	}
