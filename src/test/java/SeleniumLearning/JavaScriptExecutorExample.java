package SeleniumLearning;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorExample {
    public static WebDriver driver;
    @BeforeTest
    public void invokeBrowserAndURL() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void jsExecutor() throws IOException, InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript(Script, args);

        //flash
        WebElement element1 = driver.findElement(By.xpath("//*[@id='SIvCob']"));
        String bgColor = element1.getCssValue("backgroundColor");
        System.out.println(bgColor);
        js.executeScript("arguments[0].style.background='#000000'", element1);

        //border
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(System.getProperty("user.dir")+"\\src\\Screenshots\\Border.png");
        FileUtils.copyFile(src,trg);

        //getTitle
        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);

        //clickElement
        WebElement tamil = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
        js.executeScript("arguments[0].click();", tamil);

        //showAlert
        js.executeScript("alert('You are in alert')");


        //refresh
        js.executeScript("history.go(0)");

        //ScrollingThePage
        driver.get("https://jqueryui.com/tooltip/");
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        //size/zoom in and out
        js.executeScript("document.body.style.zoom='50%'");
        js.executeScript("document.body.style.zoom='130%'");

        Thread.sleep(6000);
    }
}
