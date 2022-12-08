package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.LoginPage;

public class Signup{
	
	private static WebDriver driver =null;
	String a;
	   
	@BeforeTest
	//Launch Browser
	   public void SignupPageRedirection() throws InterruptedException{
		   
			
		    driver=LoginPage.Lanchbrowser();
			SignupPage objsignup = new SignupPage(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	        objsignup.clickSignupLinkfromlogin();
	    	String expectedURL ="https://pilot.bygglov24.com/ManageAccount/Register";
	    	String actualURL = driver.getCurrentUrl();
	    	Assert.assertEquals(expectedURL, actualURL);
	    	System.out.println(actualURL);
	}
	//Fill the Signup form
	@Test
	public void SignupProcess() throws InterruptedException{
		SignupPage s = new SignupPage(driver);
		s.Firstname();
		s.Lastname();
		s.Email();
		s.Password();
		s.ConfirmPassword();
		s.selectCompany("Attefall24");
		s.PrivacyPolicy();
		s.ClickSubmit();
		s.AssertNewProjectPopupCheck();
		s.AssertConstructionTypeCheck();
	}
	
	//Close Browser
	  @AfterTest 
	  public void CloseBrowser() { 
	  LoginPage CloseBrowser = new
	  LoginPage(driver); CloseBrowser.CloseBrowser(); 
	  
	 }
	    
	   }
