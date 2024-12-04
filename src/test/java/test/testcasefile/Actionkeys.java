package test.testcasefile;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Actionkeys {
	public static WebDriver driver;

	public void openweb() {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\selenium\\chromedriver-win64
		// (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void gotourl() {
		try{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}catch(Exception e){
			e.printStackTrace();
		}}

	public void username() {
		try{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
	}catch(Exception e){
			e.printStackTrace();
		}}

	public void password() {
		try{driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void loginbtn() {
		try{
		driver.findElement(By.tagName("button")).click();
	}catch(Exception e){e.printStackTrace();}}


	public void directorymenu() {
		try{

		driver.findElement(By.xpath("//a[contains(@href,'Directory')]")).click();
	}catch(Exception e){e.printStackTrace();}}

	public void jobtitle() {
		WebElement job_search_box;
		List<WebElement> downlist;

		try {
			job_search_box = driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]"));
			job_search_box.click();

			downlist = job_search_box.findElements(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]/following::div[1]/div"));

			for (WebElement locate : downlist) {
				String local = locate.getText();
				System.out.println(local + " the job list");
				if (local.equalsIgnoreCase("QA engineer")) {
					locate.click();
					break; // Exit the loop after clicking the desired option
					//}driver.navigate().refresh();
				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Stale element encountered. Retrying element search...");

			// Retry logic with a maximum retry count or timeout (optional)
			int retryCount = 3; // Adjust this value as needed
		while (retryCount > 0 && driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]")).isDisplayed()) {
			try {
				System.out.println("entering inside retry block to find element max run limit");
				Thread.sleep(1000); // Wait for 1 second before retrying
			} catch (InterruptedException ex) {
				System.out.println(ex+"not tried to rerun")	;
			}
			System.out.println("out of while"+retryCount);
			retryCount--;
		}

			if (retryCount > 0) { // If element found after retries
			System.out.println("if loop" + retryCount);
			job_search_box = driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]"));
			downlist = job_search_box.findElements(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]/following::div[1]/div"));
			for (WebElement locate : downlist) {
				String local = locate.getText();
				System.out.println(local + " the job list");
				if (local.equalsIgnoreCase("QA engineer")) {
					locate.click();
					break; // Exit the loop after clicking the desired option

					//driver.navigate().refresh(); // Refresh the page after processing the dropdown
				}}
			}
		}
	}




    public void locationtitle() {
		WebElement location_search_box;
		List<WebElement> loc_downlist;
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			 location_search_box = driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[2]"));
			location_search_box.click();
			 loc_downlist =	location_search_box.findElements(By.xpath("(//div[text()='-- Select --']/following::div[1])[2]/following::div[1]/div"));
			for (WebElement locate1 : loc_downlist) {
				String local1 =	locate1.getText();
				System.out.println(local1 + " the list");
				if (local1.equalsIgnoreCase("Texas r&d")) {
					locate1.click();
				}

			}
			driver.navigate().refresh();

		} catch (Exception e) {
			System.out.println("Entered inside staleElement");
			int retry=3;
			while(retry>0 && driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[2]")).isDisplayed()){
				try {
					System.out.println("entering inside retry block to find element max run limit");
					Thread.sleep(1000); // Wait for 1 second before retrying
				} catch (InterruptedException ex) {
					System.out.println(ex+"not tried to rerun")	;
				}
				System.out.println("out of while"+retry);
				retry--;
			}
			if (retry > 0) { // If element found after retries
				System.out.println("if loop" + retry);
				location_search_box = driver.findElement(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]"));
				loc_downlist = location_search_box.findElements(By.xpath("(//div[text()='-- Select --']/following::div[1])[1]/following::div[1]/div"));
				for (WebElement locate1 : loc_downlist) {
					String local1 =	locate1.getText();
					System.out.println(local1 + " the list");
					if (local1.equalsIgnoreCase("Texas r&d")) {
						locate1.click();
					 // Exit the loop after clicking the desired option

						//driver.navigate().refresh(); // Refresh the page after processing the dropdown
					}}
			}
		}
	}



	  public void search_button() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	  driver.findElement(By.xpath("//button[text()=' Search ']")).click(); }

	  public void Reset_button() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	  driver.findElement(By.xpath("//button[text()=' Reset ']")).click(); }


	public void closeweb() {
		driver.quit();
	}
}
