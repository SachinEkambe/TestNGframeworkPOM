package wineDelivery.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WineTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   
   //create a object to call log
   WineLoginpage WineLogpg=new WineLoginpage(driver);
   
   driver.get("https://www.winedelivery.co.uk/login");
   WineLogpg.enteruserId("sachinekambe@gmail.com");
   WineLogpg.enterpassword("9096350938");
   WineLogpg.clickonlogin();
	}

}
