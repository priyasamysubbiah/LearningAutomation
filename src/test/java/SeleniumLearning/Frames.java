package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Frames{

    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

    }

    @AfterTest
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test
    public void frames(){
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='framesWrapper']/h1"))));
        System.out.println("In default content: "+driver.findElement(By.tagName("h1")).getText());
        driver.switchTo().frame("frame1");
        System.out.println("In Frame 1:  "+driver.findElement(By.tagName("h1")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        System.out.println("In Frame 2:  "+driver.findElement(By.tagName("h1")).getText());
        driver.switchTo().defaultContent();
        System.out.println("Again to default content: "+driver.findElement(By.tagName("h1")).getText());
    }

}
