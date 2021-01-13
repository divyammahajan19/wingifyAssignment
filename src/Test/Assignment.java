package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class Assignment {
	
	    @Test
	    public void amountSort() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");

		LoginPage login=new LoginPage(driver);
		login.loginmethod();
		
		HomePage header=new HomePage(driver);
		header.transactionMethod(driver);
	
	    }
}
