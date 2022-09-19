package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	//constructor
	LoginPage(WebDriver d)
	{
		driver=d;
	}
	By username=By.id("user-name");
	By password=By.id("password");
	By LoginBtn=By.id("login-button");
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		driver.findElement(LoginBtn).click();
	}
}
