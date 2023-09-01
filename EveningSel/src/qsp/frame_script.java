package qsp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_script {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	String p_id = driver.getWindowHandle();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='https://resume.naukri.com/?fftid=100001']")).click();
	//Thread.sleep(1000);
	Set<String> allwh = driver.getWindowHandles();
	int size = allwh.size();
	System.out.println(size);
	ArrayList<String> l1=new ArrayList<String>(allwh);
	String child_id = l1.get(1);
	driver.switchTo().window(child_id);
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
