import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;





import java.time.Duration;
public class POMTest {
    public static WebDriver driver = new ChromeDriver();

    void Setup() {
        System.setProperty("webDriver.chrome.driver", System.getProperty("User.dir") + "/src/test/resources/chromedriver.exe");


    }


    public static void main(String[] args) {


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
        element.sendKeys("Admin");
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));

       element1.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}
