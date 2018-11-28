package Tests;

import PageObjects.Google;
import PageObjects.GoogleSearchResults;
import Settings.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

import java.io.IOException;

public class launchDriver extends BaseTest {
    Google google= new Google();
    GoogleSearchResults googleSearchResults= new GoogleSearchResults();

    @Given("^That i have loaded the google home page$")
    public void openGoogle() throws Throwable {
        driver = initializeDriver();
        driver.get("https://google.com");
        throw new cucumber.api.PendingException();
    }
    @When("^I search for \"([^\"]*)\" in Google home search$")
    public void searchInGoogle(String searchField) throws Throwable {
        google.googleSearchField.sendKeys(searchField);
        driver.getTitle();
        throw new cucumber.api.PendingException();
    }
    @Then("^I expect some results to be found in google$")
    public void results() throws Throwable{
        googleSearchResults.howManyResultsFound.isDisplayed();
        throw new cucumber.api.PendingException();
    }

    }

