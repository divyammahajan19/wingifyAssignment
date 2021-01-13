package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement loginTextfield;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[@id='log-in']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void loginmethod() {
		
		loginTextfield.sendKeys("Divyam");
		passwordTextfield.sendKeys("divyam");
		loginButton.click();
		
	}
}
