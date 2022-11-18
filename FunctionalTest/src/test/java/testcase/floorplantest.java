package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.ProjectPopup;


public class floorplantest {
	WebDriver driver;
	
	@Test
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


	//

}
