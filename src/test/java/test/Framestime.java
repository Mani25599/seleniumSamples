package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Framestime {
    static WebDriver driver= new ChromeDriver();
    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
      driver.switchTo().frame(2);
     Select framei= new Select(driver.findElement(By.id("selectnav2")));
     framei.selectByIndex(3);
    String ans= driver.findElement(By.id("selectnav2")).getAttribute("id");
        System.out.println(ans);
    driver.switchTo().defaultContent();
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
       int abc= frames.size();
        System.out.println(abc);

    }
}
