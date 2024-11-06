package test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.PropertyPermission;

public class TablesHandling {
    static WebDriver driver=null ;

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {

        Logger logger=Logger.getLogger(TablesHandling.class);
       // DOMConfigurator.configure("Xmllog4j.xml");
      PropertyConfigurator.configure("Propertylog4j.properties");//properties configurator
        FileInputStream fileInputStream=new FileInputStream("config.properties");
        Properties property=new Properties();
        property.load(fileInputStream);
      String browser=  property.getProperty("browser");
      String driverlocation=property.getProperty("DriverLocation");
      if(browser.equalsIgnoreCase("chrome")) {
          System.setProperty("webdriver.chrome.driver", driverlocation);
          driver = new ChromeDriver();
      }
        driver.navigate().to("https://letcode.in/table");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement table = driver.findElement(By.id("shopping"));
       List<WebElement> columns=table.findElements(By.tagName("th"));
       for (WebElement col:columns) {
           String result = col.getText();
          logger.info(result);
       }
       Thread.sleep(4000);
           List<WebElement> Rowable=table.findElements(By.xpath("(//tbody)[1]//tr"));
       int size=Rowable.size();
       logger.warn("there are "+size+"rows");
       // System.out.println("there are "+size+"rows");
        List<Integer> Price=new ArrayList<Integer>();
           for(WebElement webElement:Rowable)
           {
                   String row=  webElement.getText();
                   logger.warn(row);
               //System.out.println(row);
                   List<WebElement> counts = webElement.findElements(By.tagName("td"));
                   String result1 = counts.get(1).getText();
                                Price.add(Integer.parseInt(result1));
                  // System.out.println(result1);
           }
                  int val=0;
                     for(int num:Price)
                     {
                       val += num;
                     }
                     logger.info("the sum of all numbers "+val);
                // System.out.println("the sum of all numbers "+val);
                 List<WebElement> footer= driver.findElements(By.tagName("tfoot"));

               for(WebElement colu:footer){

                   List<WebElement> colu1=colu.findElements(By.tagName("td"));
                   int total = Integer.parseInt(colu1.get(1).getText().trim());
                   logger.info(total);
                  // System.out.println(total);

                   if(total==val){
                       logger.error("the total is equal to sum of numbers in table"+total);
                      // System.out.println("the total is equal to sum of numbers in table"+total);
                   }else {
                       logger.fatal("not equal");
                      // System.out.println("not equal");
                        }}
               }

               }