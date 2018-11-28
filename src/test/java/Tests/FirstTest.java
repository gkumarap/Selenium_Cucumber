package Tests;

import PageObjects.Google;
import Settings.BaseTest;
import Settings.ChromeBrowserOpts;
import Settings.TakeScreenshot;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class FirstTest extends BaseTest {
    ChromeBrowserOpts opts = new ChromeBrowserOpts();  // setting driver path
    WebDriver driver = new ChromeDriver();   // starting chrome driver
    public void setProperty() {
        opts.setChromeDriver();
    }
    @Given("^I open browser$")
    public void openBrowser(){
        opts.startHeadlessChrome();   // to start a headless chrome
//        opts.startChromeDriver(driver)
    }
    @When("^the google page is opened$")
    public void openGoogle(){
        driver.get("https://google.com");
    }

    @Then("^I can search for \"([^\"]*)\" home page$")
    public void iCanSearchForHomePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new Google().googleSearchField.click();
        new Google().googleSearchField.sendKeys(arg0);
        new TakeScreenshot().takeScreenshot(driver);   // take screenshot.
        driver.close();
        throw new PendingException();
    }

}
