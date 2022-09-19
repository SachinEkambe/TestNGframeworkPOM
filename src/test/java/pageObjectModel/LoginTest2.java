package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lunch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Loginpage2 Loginpg=new Loginpage2(driver);
		//open url
		driver.get("https://www.saucedemo.com/");
		Loginpg.enterUsername("standard_user");
		Loginpg.enterpassword("secret_sauce");
		Loginpg.ClickOnLoginBtn();
	}

}
