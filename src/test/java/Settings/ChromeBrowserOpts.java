package Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserOpts {

    public void setChromeDriver() {
        String chromeDriver = "C://chromedriver_win32 (6)//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32 (6)//chromedriver.exe");

    }

    public void startChromeDriver(WebDriver driver) {
        setChromeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver startHeadlessChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        return null;
    }
}

