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
	
	@Test
	public void FloorplanTest() throws InterruptedException{
		CreateNewProject();
		WallMenu();
		DoorMenu();
	}
	
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
	
//Need to check this condition
	public void WallMenu() {
		FloorPlanPage f = new FloorPlanPage(driver);
		if (f.AssertFloorPlanCheck() == true) {f.clickWall();} 
		else {System.out.print("Not in floorplan page");}
		f.closeLeftMenu();
	}

	
	public void DoorMenu() {
		FloorPlanPage objinFloor = new FloorPlanPage(driver);
		if (objinFloor.AssertFloorPlanCheck() == true) {objinFloor.doorMenu();} 
		else {System.out.print("Not in floorplan page");}
		objinFloor.closeLeftMenu();
	}

	
}
