package wineDelivery.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WineLoginpage {

	WebDriver driver;
	//conStructor
	WineLoginpage(WebDriver d) 
	{
		driver=d;
	}
	By userID=By.id("MainContent_Login1_UserName");
	By password=By.id("MainContent_Login1_Password");
	By login=By.id("MainContent_Login1_Login");
	
	public void enteruserId(String UI)
	{
		driver.findElement(userID).sendKeys("sachinekambe@gmail.com");
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys("9096350938");
	}
	
	public void clickonlogin()
	{
	 driver.findElement(login).click();
	}
}
