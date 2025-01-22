package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IRCTCPractice {
    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL(){
        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }

    public static void waitForElementToBePresent(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @Test
    public void IRCTCCheck() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//i[@class='fa fa-align-justify']"));
        waitForElementToBePresent(element, 20);
        driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ng-tns-c65-11 ng-star-inserted']//li//span"));
        List<String> optionValues = new ArrayList<>();
        for(WebElement options : elements){
            optionValues.add(options.getText().trim());
        }
        System.out.println(optionValues);
        List<String> sortedValues = new ArrayList<>(optionValues);
        Collections.sort(sortedValues);

        System.out.println(sortedValues);

        if(optionValues.equals(sortedValues)){
            System.out.println("Ascending");
        }
        else{
            System.out.println("Not Ascending");
        }
    }
}
