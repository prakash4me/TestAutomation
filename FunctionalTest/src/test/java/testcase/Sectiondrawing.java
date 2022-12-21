package testcase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RoofMenuPage;



public class Sectiondrawing {
	private static WebDriver driver;
	//= LoginPage.Lanchbrowser();
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	
	
	@Test(priority = 1)
	public void LoginandCreateProject() throws InterruptedException {
		Floorplantest s = new Floorplantest();
		driver = s.CreateNewProject();
		RoofMenuCheck();
		
	}
	
	public void RoofMenuCheck() throws InterruptedException
    {
		
		RoofMenuPage r = new RoofMenuPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		r.ClickSectionView();
		r.AssertSectionViewCheck();
		r.ClickRoofMenu();
		

    }

}
