import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameSample {
    final static WebDriver driver = new ChromeDriver();
@Test
    public static void main(String[] args) {
        // Replace with your desired browser driver
        System.setProperty("webDriver.chrome.driver", System.getProperty("User.dir") + "/src/test/resources/chromedriver.exe");

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement langdropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Skills\"]")));

        Select select=new Select(langdropdown);
        select.selectByIndex(2);

    }
}
