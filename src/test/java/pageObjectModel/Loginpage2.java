package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class Loginpage2 {
WebDriver driver;
Loginpage2(WebDriver d)
{
driver=d;
PageFactory.initElements(driver, this);
}
//identify webelements
//identify username
@FindBy(id="user-name")
WebElement username;

//identify password
@FindBy(id="password")
WebElement password;

//click on loginbtn
@FindBy(id="login-button")
WebElement LoginBtn;

public void enterUsername(String uname)
{
username.sendKeys(uname);	
}
public void enterpassword(String pwd)
{
	password.sendKeys(pwd);	
}
public void ClickOnLoginBtn()
{
	LoginBtn.click();	
}
}
