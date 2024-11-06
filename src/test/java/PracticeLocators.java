import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticeLocators {
    final static  WebDriver driver = new ChromeDriver();

//    public void setup() {
//        System.setProperty("webDriver.chrome.driver", System.getProperty("User.dir") + "/src/test/resources/chromedriver.exe");
//
//
//
//    }
    public static void main(String[] args){

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // clicking cart button
        //driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

        //check for badge in cart right corner
       WebElement notificationcart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
       boolean displayed=notificationcart.isDisplayed();
        System.out.println("the check is inprogress" + notificationcart);
       if(displayed) {
           System.out.println("the badge is displayed" + displayed);
            String count=notificationcart.getText();
           System.out.println("the number of item is selected" +count);
//           try
//               num_item= new Integer(count);
       }
       else{
           System.out.println("the badge is not displayed please select any product" + displayed);
       }


    }


}
