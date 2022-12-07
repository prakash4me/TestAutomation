package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.ProjectPopupPage;


public class Floorplantest {
	WebDriver driver;
	
	@Test
    public void createProject() throws InterruptedException{
    	DashboardPage objDashboard = new DashboardPage(driver);
    	objDashboard.createProject();
    	ProjectPopupPage objprojectPopup = new ProjectPopupPage(driver);
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


	//

}
