package test;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class Autocomplete {
  //  static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

      //  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("APjFqb")).sendKeys("R");
//        List<WebElement> testarea=driver.findElements(By.xpath("//textarea[@aria-activedescendant='']"));
// for(WebElement webElement:testarea){
//     if( webElement.getText().equals("Ratan Naval Tata")){
//              }
// }
        File filelocation=new File("C:\\Users\\Manikandan\\Downloads");
       File[] totalfiles=filelocation.listFiles();
        System.out.println(totalfiles.length);
       for (File file:totalfiles){
           if(file.getName().equals("www.1TamilMV.cz - Kalki 2898 AD (2024) Tamil HQ PreDVD - 720p - x264 - HQ Clean Aud - 1.8GB.mkv")){
               System.out.println( "is present inside download");

           }


       }
    }

}