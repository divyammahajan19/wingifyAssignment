package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//th[@id='amount']")
	private WebElement amountHeader;
	
	@FindBy(xpath = "//th[@id='status']")
	private WebElement statusHeader;
	
	@FindBy(xpath = "//th[@id='date']")
	private WebElement dateHeader;
	
	@FindBy(xpath = "//th[@id='description']")
	private WebElement descriptionHeader;
	
	@FindBy(xpath = "//th[@id='category']")
	private WebElement categoryHeader;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void transactionMethod(WebDriver driver) throws InterruptedException
	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		amountHeader.click();
		
		System.out.println("Values are sorted");
	}
	
	
}
