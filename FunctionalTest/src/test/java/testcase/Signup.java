package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.LoginPage;

public class Signup{
	WebDriver driver;
	
	//Launch browser action for signup page
	    @Test
		public void Signuplanchbrowser() throws InterruptedException{
	    	LoginPage objectlaunchbrowser = new LoginPage(driver);
	    	objectlaunchbrowser.Launchbrowser();
	}
	 // Land Signup page
	        @Test 
		    public void landSignupPage() throws InterruptedException{
	    	SignupPage objsignup = new SignupPage(driver);
	    	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	objsignup.clickSignupLinkfromlogin();
	    	Thread.sleep(30);
	    	String expectedURL ="https://pilot.bygglov24.com/ManageAccount/Register";
	    	String actualURL = driver.getCurrentUrl();
	    	Assert.assertEquals(expectedURL, actualURL);
	    }
	    
	    //driver.close();
}
