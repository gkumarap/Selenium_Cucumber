package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheHindu {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/footer/div[3]/div/div[2]/div/button[1]")
    public WebElement initialNotNowButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a")
    public WebElement hinduHomeButton;
    public TheHindu() {
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(hinduHomeButton));
        PageFactory.initElements(driver,this);

    }
}
