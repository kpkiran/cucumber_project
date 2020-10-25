package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/feature" }, 
glue = { "stepdefinition" }, 
monochrome = true, 
tags = "@LoginTest", 
plugin = {"pretty","html:target/cucumber.html", "junit:target/cucumber.xml" })

public class TestRunnerTest {

}
