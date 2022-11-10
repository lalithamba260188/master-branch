package hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	@Parameters({"key","value","url"})
	@BeforeMethod
	public void openapp(String key, String value, String url)
	{
		System.setProperty(key,value);
		driver = new FirefoxDriver();
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
	}
	
	@AfterMethod()
	public void closeapp()
	{
		driver.close();
	}

}
