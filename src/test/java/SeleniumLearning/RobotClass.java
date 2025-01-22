package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class RobotClass {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        try {
            // Open a sample file upload page
            driver.get("https://www.file.io/");
            driver.manage().window().maximize();

            // Locate the file upload button
            WebElement uploadButton = driver.findElement(By.id("upload-button")); // Example locator
            uploadButton.click(); // Click to open the file upload dialog

            // Wait for the file upload dialog to appear (optional delay)
            Thread.sleep(2000);

            // File path to upload
            String filePath = "C:\\path\\to\\your\\file.txt";

            // Use Robot class to handle the file dialog
            Robot robot = new Robot();
            robot.delay(3000);

            // Copy the file path to clipboard
            StringSelection selection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

            // Simulate pressing CTRL + V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Simulate pressing ENTER to confirm
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Additional wait to ensure upload completes (adjust as needed)
            Thread.sleep(5000);

            System.out.println("File uploaded successfully!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
    }
}
