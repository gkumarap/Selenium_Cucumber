package Settings;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.OutputType.FILE;

public class TakeScreenshot {

    public void takeScreenshot(WebDriver driver) throws IOException {
        File sS=((TakesScreenshot)driver).getScreenshotAs(FILE);
        FileUtils.copyFile(sS,new File("C:\\Users\\govind\\Desktop\\SeleniumScreenshot\\test.png"));
    }
}
