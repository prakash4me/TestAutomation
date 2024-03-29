package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SectiondrawingPage {
	WebDriver driver;
	
	// Locator for section drawing icon on top
	By clicksectiondrawingbutton = By.xpath("//[@id=\"btnSection\"]");
	
	// Locator for Roof menu icon
		By clickroof = By.xpath("//*[@id=\"roof_li_id\"]");
		
	// Locator for Roof info section
		// Locator for clicking roof type option
		By selectRoofType = By.id("ddlRoofType");
		// Locator for pulpet roof option from pop-up
		By selectpulpet = By.id("PuplettakLeft_Roof");
		
		By coloritem = By.xpath("//*[@id=\"ddlFacadeRoofColour\"]/div[16]");
		
		By gableoverhang = By.xpath("//*[@id=\"objectGableOverhangFacade\"]");
		
		By overhang = By.xpath("//*[@id=\"objectRoofOverhangFacade\"]");
		
		By select3d = By.xpath("//*[@id=\"btnFacade\"]");
		
		
	
		
	public SectiondrawingPage(WebDriver driver) {
        this.driver = driver;
	}


	public void clicksectiondrawingbutton() {
		driver. findElement(clicksectiondrawingbutton).click();
		}

	 public void clickroof()
	 {
		 
		 driver. findElement(clickroof).click();
	 }
	 public void clickrooftype()
	 { 
		 driver.findElement(selectRoofType).click();
	 }
	 public void selectpulpet()
	 {
		 driver.findElement(selectpulpet).click();
	 }
	 public void selectroofmaterial()
	 {
		 driver. findElement(By.id("ddlRoofMaterialType")).click();
		 driver.findElement(By.id("FeltThreeLayour")).click();

	 }	 
	 public void clickroofcolor()
	 {
		 driver.findElement(By.id("btnRoofColor")).click();
	 }
	 public void selectroofcolor()
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.querySelector('#ddlFacadeRoofColour > div:nth-child(14)').click()");
	 }
	 
	 public void applyroofcolor()
	 {
		 driver.findElement(By.id("btnApplyRoofNCScolor")).click();
		 
		 WebElement elm = driver.findElement(By.xpath("//*[@id=\"roofFacadeEditSection\"]/div/div[2]/div[2]/div[1]/div[7]/div/p[3]/button/i"));
		 ((JavascriptExecutor) driver)
		 .executeScript("arguments[0].scrollIntoView(true);", elm);
		 
	 }
	 	 
	 public void gableoverhang()
	 {
		 
		 
		 driver.findElement(By.id("objectGableOverhangFacade")).click();
		 
		 Actions actions = new Actions (driver);
		 actions.click((driver.findElement(By.id("objectGableOverhangFacade"))))
				 .keyDown(Keys.CONTROL)
				 .sendKeys("a")
				 .keyUp(Keys.CONTROL)
				 .sendKeys(Keys.BACK_SPACE)
				 .build()
				 .perform();
				
		 
		 driver.findElement(By.id("objectGableOverhangFacade")).sendKeys("0,2");
		 
		
			 }
	 
	 public void overhang()
	 {
		 driver.findElement(By.id("objectRoofOverhangFacade")).click();
		 
		 Actions actions = new Actions (driver);
		 actions.click((driver.findElement(By.id("objectRoofOverhangFacade"))))
				 .keyDown(Keys.CONTROL)
				 .sendKeys("a")
				 .keyUp(Keys.CONTROL)
				 .sendKeys(Keys.BACK_SPACE)
				 .build()
				 .perform();
		 
		 driver. findElement(By.id("objectRoofOverhangFacade")). sendKeys("0,3");
	 }
	 public void nockyes()
	 {
		 WebElement radio = driver.findElement(By.id("openNockCeilingYesRoof"));
			radio.click(); 
	
	 } 
	 
	 public void selectdirection()
	 {
		  driver. findElement(By.xpath("//*[@id=\"roofFacadeEditSection\"]/div/div[2]/div[2]/div[1]/div[7]/div/p[1]/button")).click();
	 }
	 public void select3d()
	 {
		 driver. findElement(By.id("btnFacade")).click();
	 }
		
	 }

	


		//driver.findElement(By.id("btnApplyRoofNCScolor")).click();
		//*[@id="btnApplyRoofNCScolor"]
		 
		 //JavascriptExecutor jse=(JavascriptExecutor)driver;
		 //jse.executeScript("document.getElementsById('color-item').value='14'");
		 
		 //driver.findElement(By.xpath("//*[@id="btnApplyRoofNCScolor"]")).click();
		//*[@id="ddlFacadeRoofColour"]/div[14]
		
		 
		 
		 //JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		 //jse.executeScript("document.getElementById('color-item')");
		 //jse.executeScript("document.getElementsByName('color-item').value='#8bbc8d'");
	
	
//driver.findElement(By.xpath("//*[@id=\"ddlRoofColorPopup\"]/div[2]/div[2]/span")).click();


