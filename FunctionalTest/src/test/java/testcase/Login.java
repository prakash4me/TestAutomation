package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login {

	WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pilot.bygglov24.com/");
	}

	// Login with email
	@Test
	public void loginEmail() throws InterruptedException {
		LoginPage objLogin = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objLogin.enterUsername("automationtestemail@gmail.com");
		objLogin.enterPassword("qwerty123");
		// objLogin.selectCompany("Bygglov24");
		objLogin.clickLogin();

	}

	@AfterTest
	public void logOut() {
		LoginPage objLogin = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objLogin.clickAdminMenu();

	}

}
