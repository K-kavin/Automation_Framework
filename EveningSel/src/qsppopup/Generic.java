package qsppopup;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic 
{
	public static void sc(WebDriver driver) throws IOException
	{
		String path="./";
		Date d=new Date();
		String date = d.toString();
		String date1 = date.replace(":", "-");
		
		
		TakesScreenshot tcs=(TakesScreenshot)driver;
	
		File src = tcs.getScreenshotAs(OutputType.FILE);
		
		File dst=new File(path+date1+".jpeg");
		
		FileHandler.copy(src, dst);		
	}
}
