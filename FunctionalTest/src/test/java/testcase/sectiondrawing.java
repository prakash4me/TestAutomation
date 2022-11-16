package testcase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import pages.SectiondrawingPage;


public class sectiondrawing {
	WebDriver driver;
	
	@Test(priority = 1)
	public void sectiondrawingcases() throws InterruptedException
    {
		WebDriverWait wait=new WebDriverWait(driver, 20);
    	SectiondrawingPage objsectiondrawing = new SectiondrawingPage(driver);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    	objsectiondrawing.clicksectiondrawingbutton();
    	objsectiondrawing.clickroof(); 
    	WebElement roofpopup;
    	roofpopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PuplettakLeft_Roof")));
    	objsectiondrawing.clickrooftype();
		objsectiondrawing.selectpulpet(); 
		objsectiondrawing.selectroofmaterial();
		objsectiondrawing.clickroofcolor(); 
		objsectiondrawing.selectroofcolor();
		objsectiondrawing.applyroofcolor(); 
		objsectiondrawing.gableoverhang();
		objsectiondrawing.overhang(); 
		objsectiondrawing.nockyes();
		objsectiondrawing.selectdirection(); 
		objsectiondrawing.select3d();
		      

    }

}
