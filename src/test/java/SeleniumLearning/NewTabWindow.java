package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTabWindow {
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
    void newTab() throws InterruptedException {
        String set = Keys.chord(Keys.CONTROL,Keys.RETURN);

        driver.findElement(By.linkText("Themes")).sendKeys(set);
        Thread.sleep(4000);
    }

    @Test
    void differentTabs(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.co.in/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.co.in/");
    }
}
