package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RunnerClass extends Generic
{
	@Test
	public void test1() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
		ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.click();
	}

}
