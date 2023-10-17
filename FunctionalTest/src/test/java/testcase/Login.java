package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;

public class Login {

	private static WebDriver driver = null;
	

	// Login with email check
	
	@Test
	public WebDriver checkLogin() throws InterruptedException {
		driver = LoginPage.Lanchbrowser();
		loginEmail(driver);
		return driver;
		//Just for checking
		
	}
	
	public void loginEmail(WebDriver driver) throws InterruptedException {
		
		LoginPage objLogin = new LoginPage(driver);
		SignupPage s = new SignupPage(driver);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objLogin.enterUsername("automationtestemail@gmail.com");
		objLogin.enterPassword("qwerty123");
		objLogin.selectCompany("Bygglov24");
		objLogin.clickLogin();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		s.AssertDashboardCheck();
		}
	
	//Logout method
	public void Logout() {
		LoginPage objLogin = new LoginPage(driver);
		objLogin.clickAdminMenu();
		objLogin.clickLogoutMenu();
		objLogin.CloseBrowser();
		
	}
	
	
}
