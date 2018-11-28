package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResults {
    @FindBy(xpath = "//*[@id=\"resultStats\"]/text()")
    public WebElement howManyResultsFound;
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/button/div/span/svg")
    public WebElement searchIconInResultsPage;

}
