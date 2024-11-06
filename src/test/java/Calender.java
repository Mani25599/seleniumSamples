import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
   static WebDriver driver;
   static WebElement datebox;
    public static void main(String[] args) throws InterruptedException {

       driver=new ChromeDriver();
     System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

  datebox= driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        datebox.sendKeys("10/02/2024");
Thread.sleep(2000);
 datebox.clear();
 //datebox.sendKeys("10/02/2024");


}
}
