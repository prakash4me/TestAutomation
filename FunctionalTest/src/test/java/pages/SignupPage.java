package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignupPage {

	
	WebDriver driver;
	//Signup option locator from login page
	By clickSignupLink = By.xpath("//a[text()='Skapa konto']");
	//private WebElement clickSignupLink;

	@FindBy(xpath ="//a[text()='Skapa konto']")
	private WebElement Signuplink;
	
		public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
		private void waitForVisibility(WebElement element) throws Error{
	           new WebDriverWait(driver, 60)
	                .until(ExpectedConditions.visibilityOf(element));
	    }
	
	public void clickSignupLinkfromlogin() {
		waitForVisibility(Signuplink);
		driver.findElement(clickSignupLink).click();
	}
	}
