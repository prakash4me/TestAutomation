package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.ProjectPopupPage;
import pages.SignupPage;


public class Floorplantest {
	WebDriver driver;
	
	
	@Test
    public void createProject() throws InterruptedException{
		driver = LoginPage.Lanchbrowser();
		Login l = new Login();
		SignupPage s = new SignupPage(driver);
		DashboardPage objDashboard = new DashboardPage(driver);
		ProjectPopupPage objprojectPopup = new ProjectPopupPage(driver);
		l.loginEmail(driver);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objDashboard.createProject();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	objprojectPopup.selectConstructionType(); 
    	objprojectPopup.selectFloorType();
    	objprojectPopup.selectShape();
    	objprojectPopup.clickCreate();
    	}
}
