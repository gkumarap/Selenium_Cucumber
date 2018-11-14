package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "C:\\Users\\govind\\IdeaProjects\\Selenium_Cucumber_Pr\\src\\test\\java\\Features",
        glue = {"Tests"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
