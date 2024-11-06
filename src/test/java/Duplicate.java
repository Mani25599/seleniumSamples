import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Duplicate {
    final static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
         // Replace with your desired browser driver
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            driver.get("https://demoqa.com/alerts");
            driver.manage().window().maximize();

            // Perform actions on all "Click me" buttons in a loop
            for (int i = 1; i <= 4; i++) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                WebElement element = driver.findElement(By.xpath("//button[text()='Click me'][" + i + "]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().perform();

                // Explicit wait for the alert to appear
                Alert alert = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.alertIsPresent());

                System.out.println("Text on the alert is: " + alert.getText());
                alert.accept();
            }
        }
    }





