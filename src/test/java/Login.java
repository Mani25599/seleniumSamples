

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;
import org.junit.platform.commons.annotation.Testable;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Login {
    String[][] data = {{"admin123","Admin"},{"Admin","admin123"},{"admin123","admin123"},{"Admin","admin123"}};
    WebDriver driver=new ChromeDriver();

    @DataProvider(name = "LoginData")
    public String[][] loginDataProvider()  {
        //data = getExcelData();
        return data;

   }

    @Test(dataProvider="LoginData")
    public void loginWithBothCorrect(String username,String password) {

        System.setProperty("webDriver.chrome.driver", System.getProperty("User.dir") + "/src/test/resources/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);


        driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
