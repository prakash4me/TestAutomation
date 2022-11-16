package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.ProjectPopup;
import pages.loginPage;
import pages.SectiondrawingPage;


public class login {

	WebDriver driver;
    
	@BeforeTest
	public void lauchBrowser() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	driver.get("https://pilot.bygglov24.com/");
	
	
	}
	
    @Test(priority = 1)
	public void loginCase() throws InterruptedException{
    loginPage objLogin = new loginPage(driver);
    objLogin.enterUsername("automationtestemail@gmail.com");
    Thread.sleep(2000);
    objLogin.enterPassword("qwerty123");
    Thread.sleep(2000);
    //objLogin.selectCompany("Bygglov24");
    objLogin.clickLogin();
    Thread.sleep(3000);
    
	}
    
    @Test(priority = 2)
    public void createProject() throws InterruptedException{
    	Dashboard objDashboard = new Dashboard(driver);
    	objDashboard.createProject();
    	ProjectPopup objprojectPopup = new ProjectPopup(driver);
    	Thread.sleep(3000);
    	objprojectPopup.selectConstructionType();
    	Thread.sleep(3000);
    	objprojectPopup.selectFloorType();
    	Thread.sleep(3000);
    	objprojectPopup.selectShape();
    	Thread.sleep(3000);
    	objprojectPopup.clickCreate();
    	Thread.sleep(3000);
    }

    
	
}

