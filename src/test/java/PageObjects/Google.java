package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[1]/input")
    public WebElement googleSearchField;
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")
    public WebElement googleSearchButton;


    @FindBy(xpath = "//*[@id=\"SIvCob\"]/a")
    public WebElement changetoEnglishButton;

    @FindBy(xpath = "//*[@id=\"cnsd\"]")
    public WebElement close3475ue;
    public void Google(){
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(googleSearchButton));
        PageFactory.initElements(driver,this);
    }
}
