package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.junit.*;


@CucumberOptions(features = "C:\\Users\\govind\\IdeaProjects\\Selenium_Cucumber_Pr\\src\\test\\java\\Features\\SearchGoogle.feature"
, glue ={"C:\\Users\\govind\\IdeaProjects\\Selenium_Cucumber_Pr\\src\\test\\java\\Tests\\launchDriver.java"})

public class TestRunner_SearchGoogle extends AbstractTestNGCucumberTests {


}
