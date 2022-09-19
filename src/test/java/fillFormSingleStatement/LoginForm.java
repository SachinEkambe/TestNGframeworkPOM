package fillFormSingleStatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {

	public static void main(String[] args) {
		 Logger Log=(Logger) LogManager.getLogger();   
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		//    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//    driver.findElement(By.id("login-button")).click();

		Actions actions=new Actions(driver);
		Action seriesOfAction=actions.moveToElement( driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user", Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
		seriesOfAction.perform();
	}

}
