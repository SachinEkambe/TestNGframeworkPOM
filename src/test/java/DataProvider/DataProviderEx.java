package DataProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {
	 Logger Log=(Logger) LogManager.getLogger();   
	@DataProvider(name="SearchDataSet")
	public Object[][] SearchData()
	{
		
		Object[][] Searchkeyword=new Object[3][2];
		Searchkeyword[0][0]="India";
		Searchkeyword[0][1]="IndiaGate";
		
		Searchkeyword[1][0]="Nashik";
		Searchkeyword[1][1]="Tryambakeshwar";
		
		Searchkeyword[2][0]="Pune";
		Searchkeyword[2][1]="Shanivarwada";
		return Searchkeyword;
		
		
	}
	
	
	@Test(dataProvider ="SearchDataSet")
	public void TestDataOnGoole(String Country, String Monument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement Searchbox=driver.findElement(By.name("q"));
		
		Searchbox.sendKeys(Country +" "+ Monument);
		
		driver.findElement(By.name("btnK")).submit();
		
	}
}
