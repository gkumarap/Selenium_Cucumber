package Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        String user=System.getProperty("user.name");
        System.out.println(user);
        BufferedReader reader = new BufferedReader(new FileReader(
                "src\\main\\resources\\common.properties"));
        Properties props = new Properties();
        FileInputStream commonProperties = new FileInputStream(
                "C:\\Users\\"+user+"\\IdeaProjects\\Selenium_Cucumber_Pr\\src\\main\\resources\\common.properties");

        props.load(commonProperties);
        String browserName = props.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32 (6)//chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("IE")) {
            //internet explorer set property to launch internet explorer

        }

        return driver;
    }
}

