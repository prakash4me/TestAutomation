package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;


public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
        this.driver = driver;
	}
	@BeforeTest
	public void lauchBrowser(WebDriver driver) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	driver.get("https://pilot.bygglov24.com/");
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
