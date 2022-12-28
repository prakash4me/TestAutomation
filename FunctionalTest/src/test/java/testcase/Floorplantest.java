package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.ProjectPopupPage;
import pages.LoginPage;
import pages.SignupPage;
import pages.FloorPlanPage;



public class Floorplantest {
	private static WebDriver driver;
	DashboardPage objDashboard = new DashboardPage(driver);
	ProjectPopupPage objprojectPopup = new ProjectPopupPage(driver);
	FloorPlanPage objinFloor = new FloorPlanPage(driver);
	
	
	public void FloorplanTest() throws InterruptedException{
		Login l = new Login();
		driver = l.checkLogin();
		CreateNewProject();
		wallMenu();
		doorMenu();
	}
	
	 public WebDriver CreateNewProject() throws InterruptedException{
		//Login l = new Login();
		//driver = l.checkLogin();
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
	
	@Test
	public void wallMenu() {
		if (objinFloor.AssertFloorPlanCheck() == true) {objinFloor.clickWall();} 
		else {System.out.print("Not in floorplan page");}
		objinFloor.closeLeftMenu();
	}

	
	public void doorMenu() {
		if (objinFloor.AssertFloorPlanCheck() == true) {objinFloor.doorMenu();} 
		else {System.out.print("Not in floorplan page");}
		objinFloor.closeLeftMenu();
	}

	
}
