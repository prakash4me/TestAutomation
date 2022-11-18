package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

public class SignupPage {
	WebDriver driver;
	//Signup option locator from login page
	By clickSignupLink = By.linkText("Skapa konto");
	
	
	
	
	
	
	
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignupLink() {
		driver.findElement(clickSignupLink).click();
	}
	


}
