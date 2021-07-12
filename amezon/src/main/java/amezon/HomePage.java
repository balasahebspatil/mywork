package amezon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
//	private WebDriver driver;
	private Actions act;
	@FindBy (xpath="(//a[contains(@href,'https://www.amazon.in/ap/signin')])[1]")
	private WebElement account;
	@FindBy (xpath="(//a[contains(@href,'https://www.amazon.in/ap/signin')])[2]")
	private WebElement signIn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	public void account(WebDriver driver) throws InterruptedException
	{
		act=new Actions(driver);
		act.moveToElement(account).perform();
		Thread.sleep(2000);
		act.moveToElement(signIn).click().build().perform();

	}

}
