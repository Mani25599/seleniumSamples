package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Drag {
    static WebDriver driver=new ChromeDriver();
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
        driver.manage().window().maximize();
        driver.switchTo().frame(4);
        driver.findElement(By.id("Accepted Elements")).click();

        WebElement element= driver.findElement(By.id("draggable-nonvalid"));
        WebElement target= driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
             action.clickAndHold(element).moveToElement(target).release(target).build().perform();
        }
}
