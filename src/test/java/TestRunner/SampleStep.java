package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features/demo2.feature",
        glue = {"sampleTest"})
public class SampleStep extends AbstractTestNGCucumberTests {
}
