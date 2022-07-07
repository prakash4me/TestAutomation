package Testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.ProjectPopup;
import Pages.loginPage;


public class login {

	//Initialization
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
    objLogin.enterUsername("pdivya.work@gmail.com");
    Thread.sleep(2000);
    objLogin.enterPassword("Divya770890");
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
    
    
    
    
    
   /* @AfterTest
    public void quitBrowser()
    {
    	driver.quit();
    }
    */
	
	
}

