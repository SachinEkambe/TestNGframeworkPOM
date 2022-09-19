package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
//lunch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//create object of login page
		LoginPage logpg=new LoginPage(driver);
		
		//open url
		driver.get("https://www.saucedemo.com/");
		
		logpg.enterUsername("standard_user");
		logpg.enterpassword("secret_sauce");
	    logpg.clickLoginBtn();
	}

}
