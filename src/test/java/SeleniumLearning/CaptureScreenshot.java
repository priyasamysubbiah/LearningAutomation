package SeleniumLearning;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {

    static WebDriver driver;

    @Test
    public void fullScreenshot() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(System.getProperty("user.dir")+"\\src\\Screenshots\\image.png");
        FileUtils.copyFile(src,trg);
        driver.close();
    }

    @Test
    public void selectivePortionScreenshot() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement google= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));
        File src = google.getScreenshotAs(OutputType.FILE);
        File trg = new File(System.getProperty("user.dir")+"\\src\\Screenshots\\GoogleSearch.png");
        FileUtils.copyFile(src,trg);
        driver.close();
    }

    @Test
    public void selectiveElementScreenshot() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement google= driver.findElement(By.xpath("/html/body/div[1]/div[2]"));
        File src = google.getScreenshotAs(OutputType.FILE);
        File trg = new File(System.getProperty("user.dir")+"\\src\\Screenshots\\Google.png");
        FileUtils.copyFile(src,trg);
        driver.close();
    }

}
