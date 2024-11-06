package test.testcasefile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pageobjectfile.loginpoc;
import test.pageobjectfile.sidepanelpoc;
import java.awt.*;

public class Logintestcase {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        loginpoc.username(driver).sendKeys("Admin");
        loginpoc.password(driver).sendKeys("admin123");
        loginpoc.loginbtn(driver).click();

        }
}
