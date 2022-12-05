package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.manage();
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignupPage {

	
	  WebDriver driver = null;
	  public static int SignupIncrementalvalues = 0001;
	  
	 //Signup option locator from login page 
	  By clickSignupLink = By.xpath("//a[text()='Skapa konto']"); 
	  
	  //private WebElement clickSignupLink;
	 @FindBy(xpath ="//a[text()='Skapa konto']") private WebElement Signuplink;
	 
	 //Locator for First name
	 By FirstNameSignup = By.id("FirstName"); 
	 //Locator for last name
	 By LastnameSignup = By.id("LastName");  
	 //Locator for Email Id
	 By EmailIdSignUp = By.id("Email"); 
	 //Locator for Password
	 By PasswordSignup = By.id("Password");
	 //Locator for Confirm password
	 By ConfirmPassword = By.id("ConfirmPassword");
	 //Locator for select company
	 By SelectCompanySignup = By.id("ddlCompanyList");
	 //Locator for privacy policy
	 By PrivacyPolicyCheckbox = By.id("IsPrivacyPolicy");
	 //Locator for Signup button
	 By SignupButton = By.id("signUp"); 
	 
	 StringBuilder Firstname = new StringBuilder().append(++SignupIncrementalvalues).append("automation");
	 
	  
	  public SignupPage(WebDriver driver) 
	  { 
		  this.driver = driver; 
		  } 
	 
	//click signup link
	  public void clickSignupLinkfromlogin() { 
	  driver.findElement(clickSignupLink).click(); 
	  }
	 
	  public void Firstname() {
		  driver.findElement(FirstNameSignup).sendKeys(Firstname);
	  }
	}
