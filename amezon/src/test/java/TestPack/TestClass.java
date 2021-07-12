package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amezon.HomePage;

public class TestClass 
{
	private WebDriver driver;
	private HomePage homepage;
	@BeforeClass
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing By Velocity\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void loadapp()
	{
		driver.get("https://www.amazon.in/");
		homepage=new HomePage(driver);
	}
	@Test
	public void account() throws InterruptedException
	{
		homepage.account(driver);
		
	}
	@AfterMethod
	public void refresh()
	{
		driver.navigate().refresh();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
