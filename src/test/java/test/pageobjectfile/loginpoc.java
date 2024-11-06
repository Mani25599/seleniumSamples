package test.pageobjectfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginpoc {


    public static WebElement username(WebDriver driver){
      WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
      return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }
    public static WebElement password(WebDriver driver){
        WebDriverWait wait1=  new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

    }
    public static WebElement loginbtn(WebDriver driver){
       return driver.findElement(By.tagName("button"));
    }
}
