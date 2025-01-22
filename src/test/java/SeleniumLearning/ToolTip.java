package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolTip {
    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL() {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void tooltip() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("//input[@id='age']"));
        String tooltip = element.getAttribute("title");
        System.out.println(tooltip);
    }
}
