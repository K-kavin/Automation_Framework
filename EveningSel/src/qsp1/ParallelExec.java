package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec {

	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		else {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}
}
