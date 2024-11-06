package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestng {
    Object[][] data = null;
    
    WebDriver driver ;
    @DataProvider(name = "LoginData")
    public Object[][] loginDataProvider() throws BiffException, IOException {
        data = getExcelData();
        return data;

    }


    public Object[][] getExcelData() throws IOException, BiffException {
        try (FileInputStream excel = new FileInputStream("C:\\Users\\Manikandan\\IdeaProjects\\LearnSeleniumAutomation\\src\\test\\java\\resources\\Excelsheet1.xls")) {
            Workbook workbook = Workbook.getWorkbook(excel);
            Sheet sheet = workbook.getSheet(0);
            int rowscount = sheet.getRows();
            System.out.print("the row count :"+rowscount);
            int columncount = sheet.getColumns();
            System.out.print("the column count :"+columncount);
            Object testdata[][] = new String[rowscount-1][columncount];
            for (int i = 1; i < rowscount; i++) {
                for (int j = 0; j < columncount; j++) {
                    testdata[i-1][j] = sheet.getCell(j,i).getContents();
                    System.out.println("testdata each value :"+testdata[i-1][j]);
                }
            }
            return testdata;
        } 
        
    }

    @BeforeTest
    public void beforetest() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterthetest(){
        driver.quit();
    }


    @Test(dataProvider = "LoginData")
    public void loginWithdataCorrect(String FirstName, String LastName, String Address , String Emailaddress, String Phone, String Gender, String Hobbies, String Languages, String Skills) throws InterruptedException {

 
// driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-pristine')])[3]")).click();
//        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys(Address );
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys(Emailaddress);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys(Phone);
if (Gender.equalsIgnoreCase("Male")) {
            driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
        } else {
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
        }
       if(Hobbies.equals("Cricket")) {
    	   driver.findElement(By.id("checkbox1")).click();
       }else if(Hobbies.equals("Movies")) {
    	   driver.findElement(By.id("checkbox2")).click();
       }else if(Hobbies.equals("Hockey")) {
    	   driver.findElement(By.id("checkbox3")).click();
       }
       
      List<WebElement>columns=  driver.findElements(By.xpath("(//ul)[9]/li"));
      
      for(WebElement values:columns) {
    	  if (values.getText().equals(Languages)) {
    		  values.click();
              return;
          }
      }
       
        WebElement Skill = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select1 = new Select(Skill);
        select1.selectByValue(Skills);
    
    }
}
