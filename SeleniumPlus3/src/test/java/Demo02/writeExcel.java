package Demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeExcel {
  @Test
  public void f() throws IOException {
	  
	  File scr=new File("C:\\Users\\smruti.priya\\Sel-Screenshots\\Testdata.xlsx");
	  FileInputStream file= new FileInputStream(scr);
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet sheet1=wb.getSheetAt(0) ;
	  sheet1.getRow(1).createCell(2).setCellValue("pass");
	  sheet1.getRow(2).createCell(2).setCellValue("fail");

	  FileOutputStream fo=new FileOutputStream(scr);
	  wb.write(fo);
	  wb.close();

  }
}
