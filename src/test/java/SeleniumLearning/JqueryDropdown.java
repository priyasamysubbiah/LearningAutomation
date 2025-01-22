package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class JqueryDropdown {
    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL(){
        driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test
    public void dropDown(){
        driver.findElement(By.id("justAnInputBox")).click();
        selectDropDown("all");
        //selectDropDown("choice 2");
        //selectDropDown("choice 1", "choice 2 2", "choice 2 3", "choice 6 2 1");
    }

    public static void selectDropDown(String... value){
       try {
           List<WebElement> choiceList = driver.findElements(By.xpath("//span[contains(@class, 'comboTreeItemTitle')]"));
           if(!value[0].equalsIgnoreCase("all")) {
               for (WebElement choice : choiceList) {
                   String text = choice.getText();
                   for (String options : value) {
                       if (options.equalsIgnoreCase(text)) {
                           choice.click();
                           break;
                       }
                   }
               }
           }
           else {
               for (WebElement choices : choiceList){
                   choices.click();
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
