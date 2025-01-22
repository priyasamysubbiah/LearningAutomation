package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    static WebDriver driver;

    @Test
    public void brokenLinks() throws MalformedURLException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links = driver.findElements(By.xpath("//div//li/a"));
        int brokenLinkCount = 0;
        System.out.println(links.size());
        ;
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("No URL present");
                continue;
            }

            URL link1 = new URL(url);
            try {
                HttpURLConnection httpConn = (HttpURLConnection) link1.openConnection();
                httpConn.connect();
                if (httpConn.getResponseCode() >= 400) {
                    System.out.println("Broken link: " + link.getText());
                    brokenLinkCount++;
                } else {
                    System.out.println("Valid Link: " + link.getText());
                }

            } catch (Exception e) {

            }
        }
        System.out.println(brokenLinkCount);
        driver.quit();
    }
}
