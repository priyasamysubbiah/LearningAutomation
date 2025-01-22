package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait {
    static WebDriver driver;
    public static void main(String[] main){
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(org.openqa.selenium.NoSuchElementException.class);
//
//        WebElement element = wait.until(new Function<WebDriver, WebElement>(){
//            public WebElement apply (WebDriver driver){
//                return driver.findElement(By.id(""));
//            }
//        });
    }

}
