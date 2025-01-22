package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SizeandLocationElement {

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
    void locationAndSize(){
        WebElement image = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        System.out.println(image.getLocation());
        System.out.println(image.getLocation().getX());
        System.out.println(image.getLocation().getY());

        System.out.println(image.getRect().getX());
        System.out.println(image.getRect().getY());

        System.out.println(image.getSize());
        System.out.println(image.getSize().getHeight());
        System.out.println(image.getSize().getWidth());

        System.out.println(image.getRect().getDimension());
        System.out.println(image.getRect().getDimension().getWidth());
        System.out.println(image.getRect().getDimension().getHeight());

    }
}
