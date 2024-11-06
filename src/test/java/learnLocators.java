import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class learnLocators {

final static WebDriver driver = new ChromeDriver();
    @Test
    public void Setup() {

        System.setProperty("webDriver.chrome.driver", System.getProperty("User.dir") + "/src/test/resources/chromedriver.exe");

    }

    public static void main(String[] args) {

        driver.get("https://www.automationexercise.com/login");
        //String Title = driver.getTitle();
        driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      WebElement username= driver.findElement(By.name("name"));
      username.sendKeys("Admin");
       driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("admin13333@gmail.com");
       driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
        driver.findElement(By.id("password")).sendKeys("123456789");
        WebElement dropdownElement1 = driver.findElement(By.id("days"));
       // dropdownElement.click();
        Select day = new Select(dropdownElement1);
        day.selectByValue("24");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dropdownElement2 = driver.findElement(By.id("months"));
        // dropdownElement.click();
        Select month = new Select(dropdownElement2);
        month.selectByIndex(11);
        WebElement dropdownElement3 = driver.findElement(By.id("years"));
        // dropdownElement.click();
        Select year = new Select(dropdownElement3);
        year.selectByValue("1999");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']")).click();
        driver.findElement(By.xpath("//label[text()='Receive special offers from our partners!']")).click();
        driver.findElement(By.id("first_name")).sendKeys("Test1");

        driver.findElement(By.id("last_name")).sendKeys("Test2");
        driver.findElement(By.id("address1")).sendKeys("Add1");
        driver.findElement(By.id("address2")).sendKeys("Add2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement Country= driver.findElement(By.id("country"));
       Select Count= new Select(Country);
       Count.selectByValue("India");
        driver.findElement(By.id("state")).sendKeys("tamilnadu");
        driver.findElement(By.id("city")).sendKeys("madurAI");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("zipcode")).sendKeys("231562");
        driver.findElement(By.id("mobile_number")).sendKeys("1234567889");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();
driver.close();


     }



}
