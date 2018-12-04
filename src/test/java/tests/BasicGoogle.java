package tests;

import Settings.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicGoogle extends BaseTest {

    @Given("^when Webdriver loads$")
    public void whenWebdriverLoads() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = initializeDriver();
        driver.manage().window().maximize();
    }

    @When("^Browser loads \"([^\"]*)\"$")
    public void browserLoads(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg0);
    }

    @Then("^just exit the page$")
    public void justExitThePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
