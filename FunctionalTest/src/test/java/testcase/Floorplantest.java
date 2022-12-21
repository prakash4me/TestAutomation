package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.ProjectPopupPage;



public class Floorplantest {
	private static WebDriver driver;
	
	
	@Test
    public WebDriver CreateNewProject() throws InterruptedException{
		Login l = new Login();
		driver = l.checkLogin();
		DashboardPage objDashboard = new DashboardPage(driver);
		ProjectPopupPage objprojectPopup = new ProjectPopupPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objDashboard.createProject();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	objprojectPopup.selectConstructionType(); 
    	objprojectPopup.selectFloorType();
    	objprojectPopup.selectShape();
    	objprojectPopup.clickCreate();
    	return driver;
    	}
}
