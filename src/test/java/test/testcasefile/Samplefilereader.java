package test.testcasefile;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Samplefilereader {

//    public void reafile() throws IOException {
//        FileInputStream file = new FileInputStream("C:\\Users\\Manikandan\\IdeaProjects\\LearnSeleniumAutomation\\src\\test\\java\\resources\\Excelsheet1.xls");
//        HSSFWorkbook workbook = new HSSFWorkbook(file);
//        HSSFSheet sheet = workbook.getSheet("Sheet1");
//        HSSFCell cell = sheet.getRow(1).getCell(0);
//        String cellvalue = cell.getStringCellValue();
//        System.out.println(cellvalue);
//
//    }


public static  void main(String[] args) throws InterruptedException  {
  // Samplefilereader obj=new Samplefilereader();
////obj.reafile();
//
Actionkeys actionkeys=new Actionkeys();
    actionkeys.openweb();
    actionkeys.gotourl();
    
    actionkeys.username();
    actionkeys.password();
    actionkeys.loginbtn();
    actionkeys.directorymenu();
   actionkeys.jobtitle();
    actionkeys.search_button();
    actionkeys.Reset_button();
    actionkeys.locationtitle();
    actionkeys.search_button();

//    actionkeys.search_button();

   // actionkeys.closeweb();
}
}
