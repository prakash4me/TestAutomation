package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login {

	WebDriver driver = null;

	// Login with email
	@Test(priority = 1)
	public void loginEmail() throws InterruptedException {
		driver = LoginPage.Lanchbrowser();
		LoginPage objLogin = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objLogin.enterUsername("automationtestemail@gmail.com");
		objLogin.enterPassword("qwerty123");
		objLogin.selectCompany("Bygglov24");
		objLogin.clickLogin();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		objLogin.clickAdminMenu();
		objLogin.clickLogoutMenu();
		objLogin.CloseBrowser();
	}

}
