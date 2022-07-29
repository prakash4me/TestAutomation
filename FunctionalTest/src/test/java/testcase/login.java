package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.ProjectPopup;
import pages.loginPage;
import pages.sectiondrawing;


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
    @Test(priority = 3)
    public void sectiondrawing() throws InterruptedException
    {
    	sectiondrawing objsectiondrawing = new sectiondrawing(driver);
    	objsectiondrawing.clicksectiondrawing();
    	Thread.sleep(3000);
    	objsectiondrawing.clickroof();
    	Thread.sleep(3000);
    	objsectiondrawing.clickrooftype();
    	Thread.sleep(3000);
    	objsectiondrawing.selectpulpet();
    	Thread.sleep(3000);
    	objsectiondrawing.selectroofmaterial();
    	Thread.sleep(3000);
    	objsectiondrawing.clickroofcolor();
    	Thread.sleep(3000);
    	objsectiondrawing.selectroofcolor();
    	Thread.sleep(3000);
    	objsectiondrawing.applyroofcolor();
    	Thread.sleep(3000);
    	objsectiondrawing.gableoverhang();
    	Thread.sleep(3000);
    	objsectiondrawing.overhang();
    	Thread.sleep(3000);
    	objsectiondrawing.nockyes();
    	Thread.sleep(3000);
    	objsectiondrawing.selectdirection();
    	Thread.sleep(3000);
    	objsectiondrawing.select3d();
    	Thread.sleep(3000);
    }
    
	
}

