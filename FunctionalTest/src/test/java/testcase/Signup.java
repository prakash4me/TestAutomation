package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.LoginPage;

public class Signup{
	
	private static WebDriver driver =null;
	   
	@Test
	   public void SignupPageRedirection() throws InterruptedException{
		   
			
		    driver=LoginPage.Lanchbrowser();
			SignupPage objsignup = new SignupPage(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	        objsignup.clickSignupLinkfromlogin();
	    	String expectedURL ="https://pilot.bygglov24.com/ManageAccount/Register";
	    	String actualURL = driver.getCurrentUrl();
	    	Assert.assertEquals(expectedURL, actualURL);
	    	System.out.println("Test pass");
	    	//LoginPage CloseBrowser = new LoginPage(driver);
	    	//CloseBrowser.CloseBrowser();
	    }
	@Test
	public void SignupProcess() throws InterruptedException{
		SignupPage s = new SignupPage(driver);
		s.Firstname();
	}
	  
	    
	   }
