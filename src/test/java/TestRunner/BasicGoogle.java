package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src\\test\\resources\\features\\BasicGoogle.feature",
        glue ="tests")
public class BasicGoogle extends AbstractTestNGCucumberTests {
}
