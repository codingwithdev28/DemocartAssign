package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Features/democartassignment.feature",

glue = {
"StepsDefinition",
"hooks"
},

plugin = {
"pretty",
"html:target/cucumber-report.html"
}

)

public class TestRunner
extends AbstractTestNGCucumberTests {

}