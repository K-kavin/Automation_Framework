package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RunnerClass1 {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automation-lab/login.jsp");
		POM1 p1=new POM1(driver);
		p1.userName("admin");
		Thread.sleep(2000);
		p1.passWord("manager");
		Thread.sleep(2000);
		p1.clickLogin();
	}

}
