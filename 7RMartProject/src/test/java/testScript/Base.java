package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void intlializeBrowser()
	{
		driver =new ChromeDriver();//loading the driver
		driver.get("https://groceryapp.uniqassosiates.com/admin");//launching the URL
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void driverQuit()
	{
		driver.close();
	
	//driver.quit();
	}

	public static void main(String[] args) 
	{
		Base base=new Base();
		base.intlializeBrowser();
		base.driverQuit();

	}


}
