package test.pageobjectfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.menu;

public class sidepanelpoc {
    public static void gotodirectory(WebDriver driver)  {
        WebElement menus= driver.findElement(By.partialLinkText("/web/index.php/directory/viewDirectory"));


           System.out.println("the sidepanel datas are :"+menu);
           }

    }
//        public static WebElement Searchoption(WebDriver driver)throws AWTException{
//            WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input)[1]")));
//                  search.sendKeys("ad");
//                  return search;
//        }




