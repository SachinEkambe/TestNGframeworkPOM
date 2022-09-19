package EncodePasswordDemo;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePasswordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
//   String password="9096350938";
//    byte[] encodepassword=Base64.encodeBase64(password.getBytes());
//    System.out.println(new String(encodepassword));

    driver.get("https://www.winedelivery.co.uk/login");

    driver.findElement(By.id("MainContent_Login1_UserName")).sendKeys("sachinekambe@gmail.com");

    //decode password
    byte[]decodepassword=Base64.decodeBase64("OTA5NjM1MDkzOA==");
    driver.findElement(By.id("MainContent_Login1_Password")).sendKeys(new String(decodepassword));

    //click on login 
    driver.findElement(By.id("MainContent_Login1_Login")).click();
	}

}
