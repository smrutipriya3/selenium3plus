package Demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readPoi {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	 
	  File src=new File("C:\\Users\\smruti.priya\\Sel-Screenshots\\Testdata.xlsx");
	  FileInputStream file = new FileInputStream(src);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet sh= wb.getSheetAt(0);
	  
	  for(int i=1; i<=sh.getLastRowNum();i++) {
		  
		  String data0 = sh.getRow(i).getCell(0).getStringCellValue();
		  String data1= sh.getRow(i).getCell(1).getStringCellValue();
		  
		  /* System.out.println(data0);
		  System.out.println(data1);
		  System.out.println("--------------");*/
		  
		  driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.findElement(By.name("userName")).sendKeys(data0);
		  driver.findElement(By.name("password")).sendKeys(data1);
		  
		  CaptureScreen.capturescreen(driver);
		  
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(2000);
		  driver.close();
	  }
	  
	  wb.close();
  }
}
