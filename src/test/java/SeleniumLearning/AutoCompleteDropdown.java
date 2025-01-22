package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoCompleteDropdown {
    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL() {
        driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com/newsearchserviceneed");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void autoComplete() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.id("autocomplete"));
        searchBox.clear();
        searchBox.sendKeys("Toronto");

        String text = "";
        do {
            searchBox.sendKeys(Keys.ARROW_DOWN);
            text = searchBox.getText();
            if (text.equalsIgnoreCase("Toronto, OH, USA")) {
                searchBox.sendKeys(Keys.ENTER);
                break;
            }
            Thread.sleep(3000);
        } while (!text.isEmpty());

    }
}
