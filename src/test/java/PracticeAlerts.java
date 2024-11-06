import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeAlerts {
    final static WebDriver driver = new ChromeDriver();

    public static void main(String[] args){
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
       //case 1
        WebElement element = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
        Alert alert1=driver.switchTo().alert();
        alert1.getText();
        System.out.println("text on the alert is" + alert1);
        alert1.accept();

//case 2
        WebElement element1 = driver.findElement(By.xpath("(//button[text()='Click me'])[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).click().build().perform();
        Alert alert2=driver.switchTo().alert();
        alert2.getText();
        System.out.println("text on the alert is" + alert2);
        alert2.accept();
// case 3
        WebElement element2 = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(element2).click().build().perform();
        Alert alert3=driver.switchTo().alert();
        alert3.getText();
        System.out.println("text on the alert is" + alert3);
        alert3.accept();
//case 4
        WebElement element3 = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(element3).click().build().perform();
        Alert alert4=driver.switchTo().alert();
        alert4.getText();
        System.out.println("text on the alert is" + alert4);
        alert4.accept();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       //WebElement alert= driver.findElement(By.xpath("//button[@id='alertButton']"));
 //alert.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='alertButton']"))).click();

//        switch(i)
//        {
//
//            //Case statements
//            case 1: select.selectByIndex(1);
//                System.out.println("the first index is "+ select);
//                driver.findElement(By.linkText("Alert with OK")).click();
//                driver.findElement(By.xpath("//button[text()='click the button to display an  alert box:']")).click();
//                alert1.accept();
//                break;
//            case 2: select.selectByIndex(2);
//                System.out.println("the second index is "+ select);
//                driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//                alert1.dismiss();
//                break;
//            case 3: select.selectByIndex(3);
//                System.out.println("the third index is "+ select);
//                driver.findElement(By.linkText("Alert with Textbox")).click();
//                alert1.getText();
//                alert1.sendKeys("Automation on fire");
//                break;
//            //Default case statement
//            default:System.out.println("no more alerts");
//        }



    }
}
