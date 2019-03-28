package Demo02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreen {
	
	public static void capturescreen(WebDriver driver) throws IOException
	{
		 //Takesscreenshot is an interface, hence cannot create object so Typecast
		  TakesScreenshot ts= (TakesScreenshot)driver;
		  
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  //copy and paste
		  FileUtils.copyFile(src, new File("C:\\Users\\smruti.priya\\Sel-Screenshots\\"+timeStamp()+"Image.png"));
		 
	}
	public static String timeStamp()
	{
		String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		return fileSuffix;
		
	}
	

}
