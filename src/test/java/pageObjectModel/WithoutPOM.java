package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutPOM {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//open url
driver.get("https://www.saucedemo.com/");
//find & enter username
driver.findElement(By.id("user-name")).sendKeys("standard_user");
//find & enter password
driver.findElement(By.id("password")).sendKeys("secret_sauce");
//find & click loginbtn
driver.findElement(By.id("login-button")).click();



		}

}
