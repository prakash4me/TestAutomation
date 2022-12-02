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
	
	//Launch browser action for signup page
	   
		public static WebDriver Signuplanchbrowser() {
			
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
			driver.get("https://pilot.bygglov24.com");
			return driver;
	   }
	   
	@Test
	   public void SignupPageRedirection() throws InterruptedException{
		   
			
		   driver = Signup.Signuplanchbrowser();
			//driver.get("https://pilot.bygglov24.com");
		   //LoginPage objectlaunchbrowser = new LoginPage(driver);
		   //objectlaunchbrowser.Launchbrowser();
			SignupPage objsignup = new SignupPage(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	        objsignup.clickSignupLinkfromlogin();
	    	String expectedURL ="https://pilot.bygglov24.com/ManageAccount/Register";
	    	String actualURL = driver.getCurrentUrl();
	    	Assert.assertEquals(expectedURL, actualURL);
	    	System.out.println("Test pass");
	    	LoginPage CloseBrowser = new LoginPage(driver);
	    	CloseBrowser.ClosePage();
	    }
	  
	    
	    //driver.close();
}
