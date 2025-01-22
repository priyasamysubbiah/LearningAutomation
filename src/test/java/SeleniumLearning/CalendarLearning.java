package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class CalendarLearning {

    static WebDriver driver;

    @Test
    public void calendar(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/calendar");
        //driver.navigate().to(letcode.in/calendar);
        String year = "2025";
        String month = "January";
        String date = "5";

        while(true){
            String monthSet = driver.findElement(By.xpath("(//div[@class='datepicker-nav-month'])[1]")).getText();
            String yearSet = driver.findElement(By.xpath("(//div[@class='datepicker-nav-year'])[1]")).getText();
            if(monthSet.equalsIgnoreCase(month) && yearSet.equalsIgnoreCase(year)){
                break;
            }else if (Integer.parseInt(yearSet)<Integer.parseInt(year)|| (yearSet.equals(year) && monthSet.compareToIgnoreCase(month) < 0)){
                driver.findElement(By.xpath("(//button[@class='datepicker-nav-next button is-small is-text'])[1]")).click();
            } else {
                driver.findElement(By.xpath("(//button[@class='datepicker-nav-previous button is-small is-text'])[1]")).click();
            }
        }

        List<WebElement> datesSet = driver.findElements(By.xpath("(//div[@class='datepicker-days'])[1]//div"));
        for(WebElement dates : datesSet){
            if(dates.getText().equalsIgnoreCase(date)){
                dates.click();
                break;
            }
        }
    }

    @Test
    public void calendarDropdown(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        String year = "2001";
        String month = "May";
        String date = "11";

        driver.findElement(By.xpath("//input[@id='dob']")).click();
        Select monthSet = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        monthSet.selectByVisibleText(month);

        Select yearSet = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        yearSet.selectByVisibleText(year);

        List<WebElement> datesSet = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));

        for(WebElement dates: datesSet){
            if(dates.getText().equals(date)){
                dates.click();
                break;
            }
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
