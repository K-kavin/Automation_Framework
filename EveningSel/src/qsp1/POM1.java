package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	@FindBy(name="username")
	private WebElement unTbox;
	@FindBy(name="pwd")
	private WebElement pwdTbox;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void userName(String un)
	{
		unTbox.sendKeys(un);
	}
	public void passWord(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}

}
