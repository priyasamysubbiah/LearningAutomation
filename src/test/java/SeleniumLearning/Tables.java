package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    public static WebDriver driver;

    @BeforeTest
    public void invokeBrowserAndURL(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");

    }

    @AfterTest
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test(enabled = false)
    public void tables(){
        WebElement table1 = driver.findElement(By.id("shopping"));
        List<WebElement> headers = table1.findElements(By.tagName("th"));
        for ( WebElement x: headers){
            System.out.println(x.getText());
        }
        List<WebElement> allRows = table1.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        System.out.println("Size of rows: "+allRows.size());
//        for (WebElement row:allRows){
//            List<WebElement> columns = row.findElements(By.tagName("td"));
//            System.out.print(columns.get(0).getText()+" ");
//        }

        for (int i = 0 ; i<allRows.size(); i++){
            List<WebElement> row = allRows.get(i).findElements(By.tagName("td"));
            WebElement name = row.get(0);
            if(name.getText().equals("Chocolate")){
                System.out.println("Pass");
                break;
            }
            else
                System.out.println("Fail");
        }
    }

    @Test
    public void searchInTable(){
        String searchTerm= "Eggs";
        WebElement table = driver.findElement(By.id("shopping"));
        List<WebElement> rows = table.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        boolean found = false;
        for (int i = 0; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) {
                WebElement cell = columns.get(j);
                if(cell.getText().equalsIgnoreCase(searchTerm)){
                    System.out.println(searchTerm +" is at row: "+(i+1) +" and column: "+(j+1));
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        if (!found)
            System.out.println("Not available");
    }
}
