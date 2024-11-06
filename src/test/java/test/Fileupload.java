package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Fileupload {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://easyupload.io/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]")).click();
Thread.sleep(3000);
        String file="C:\\Users\\Manikandan\\Downloads\\ISTQB_CTFL_Syllabus-v4.0";

        StringSelection selection= new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}