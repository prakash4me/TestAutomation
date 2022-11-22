package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;


public class Login {

		WebDriver driver;
	@Test
	public void lauchBrowserforlogin() throws InterruptedException{

	LoginPage objectlaunchbrowseer = new LoginPage(driver);
	objectlaunchbrowseer.Launchbrowser();
	}
	
	//Login with email 
    @Test
	public void loginEmail() throws InterruptedException{
    LoginPage objLogin = new LoginPage(driver);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    objLogin.enterUsername("automationtestemail@gmail.com");
    objLogin.enterPassword("qwerty123");
   //objLogin.selectCompany("Bygglov24");
    objLogin.clickLogin();
    Thread.sleep(3000);
}
}
