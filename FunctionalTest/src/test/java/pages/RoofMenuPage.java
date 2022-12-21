package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoofMenuPage {
	WebDriver driver;
	//Locator for view buttons 
	 By ViewIcons = By.id("btnGroupIcon");       
	 //Locator for Section view icon
	    By SectionView =By.xpath(".//button[contains(@onclick, 'showSectionView()')]");
	    //Locator for section view canvas
	    By SectionviewCanvas = By.id("canvas");
	
	     // Locator for Roof menu icon on left side in section drawing page
			By LeftSideRoofMenuICon = By.id("roof_li_id");
			
		// Locator for Roof info section
			//Locator for info section title
			By RoofSectionTitle = By.xpath("//h3[contains (text(),'Tak')]");
			//Locator for roof image
			By RoofImage = By.id("editFacadeRoofMaterialImg");
			
			// Locator for clicking roof type option
			By SelectRoofType = By.id("ddlRoofType");
			//Locator for Roof type pop-up
			By TitleofRoofTypePopup = By.id("roofTypeObjects");
			//locator for Gable roof option from popup
			By SelectGable = By.id("sadeltak_Roof");
			// Locator for pulpet roof option from pop-up
			By SelectPulpet = By.id("PuplettakLeft_Roof");
			//Locator for close roof type pop-up
			By CloseRoofTypePopup = By.className("obj-close");
			
			//Locator for Roof material selection
			By RoofMaterial = By.id("ddlRoofMaterialType");
			//Locator for roof material popup
			By RoofMaterialPopup = By.id("roofMaterialObjects");
			//Locator for close roof Material pop-up
			By CloseRoofMaterialPopup = By.className("obj-close");
			//Locator for ConcreateTileRebatd roof type
			By SelectConcreateTileRebatd = By.id("ConcreateTileRebatd");
			//Locator for TileRebated roof type
			By SelectTileRebated = By.id("TileRebated");
			//Locator for TileNotRebated roof type
			By SelectTileNotRebated = By.id("TileNotRebated");
			//Locator for MetalTileForm roof type
			By SelectMetalTileForm = By.id("MetalTileForm");
			//Locator for CorrugatedMetal roof type
			By SelectCorrugatedMetal = By.id("CorrugatedMetal");
			//Locator for Shingel roof type
			By SelectShingel = By.id("Shingel");
			//Locator for FeltOneLayour roof type
			By SelectFeltOneLayour = By.id("FeltOneLayour");
			//Locator for FeltTwoLayer roof type
			By SelectFeltTwoLayer = By.id("FeltTwoLayer");
			//Locator for FeltThreeLayour roof type
			By SelectFeltThreeLayour = By.id("FeltThreeLayour");
			//Locator for TinZinSimple roof type
			By SelectTinZinSimple = By.id("TinZinSimple");
			//Locator for TinZinDouble roof type
			By SelectTinZinDouble = By.id("TinZinDouble");
			//Locator for CorrugatedPolycarbonate roof type
			By SelectCorrugatedPolycarbonate = By.id("CorrugatedPolycarbonate");
			//Locator for MultiwallPolycarbonate roof type
			By SelectMultiwallPolycarbonate = By.id("MultiwallPolycarbonate");
			//Locator for Polycarbonate roof type
			By SelectPolycarbonate = By.id("Polycarbonate");
			//Locator for Glass roof type
			By SelectGlass = By.id("Glass");
			//Locator for Sedum roof type
			By SelectSedum = By.id("Sedum");
			//Locator for BoardRoof roof type
			By SelectBoardRoof = By.id("BoardRoof");
			
			//Locator for Roof color field
			By RoofColour = By.id("btnRoofColor");
			//Locator for Roof colour NCS code
			By RoofNCSColour = By.id("roofFacadeEditColor");
			//Locator for roof Color popup
			By RoofColourPopup = By.id("roofMaterialObjects");
			//Locator for close roof Colour pop-up
			By CloseRoofColourPopup = By.className("obj-close hidedrpdwn");
			// Locator for NCS code A field
			By NCSCodeAField = By.id("ddlRoofNCSPartAListDiv");
			// Locator for NCS code B field
			By NCSCodeBField = By.id("ddlRoofNCSPartBListDiv");
			// Locator for NCS code C field
			By NCSCodeCField = By.id("ddlRoofNCSPartCListDiv");
		    // Locator for NCS code D field
			By NCSCodeDField = By.id("ddlRoofNCSPartDListDiv");
			//Locator for preview of selected colour
			By PreviewRoofNCSColor = By.id("previewRoofNCSColor");
			//Locator for facade roof colours
			By FacadeRoofColour = By.id("ddlFacadeRoofColour");
			//Locator for Apply button
			By ApplyColour = By.id("btnApplyRoofNCScolor");	
			
			//Locator for Open to nock yes option
			By OpenNockCeilingYesRoof = By.id("openNockCeilingYesRoof");
			//Locator for Open to nock No option
			By OpenNockCeilingNoRoof = By.id("openNockCeilingNoRoof");
			
			//Locator for Left roof direction
			By LeftRoofDirection = By.xpath(".//button[contains(@onclick, 'ChangeRoofDirection('left')')]");
			//Locator for Top roof direction
			By TopRoofDirection = By.xpath(".//button[contains(@onclick, 'ChangeRoofDirection('top')')]");
			//Locator for Right roof direction
			By RightRoofDirection = By.xpath(".//button[contains(@onclick, 'ChangeRoofDirection('right')')]");
			//Locator for Bottom roof direction
			By BottomRoofDirection = By.xpath(".//button[contains(@onclick, 'ChangeRoofDirection('bottom')')]");
			
						
			public RoofMenuPage(WebDriver driver) {
		        this.driver = driver;
			}
			
			public void ClickSectionView() {
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(SectionView));
				driver.findElement(SectionView).click();
			}
			  public void AssertSectionViewCheck() {
				  WebDriverWait wait=new WebDriverWait(driver,20);
				  WebElement SectionCanvas;
				  SectionCanvas =wait.until(ExpectedConditions.visibilityOfElementLocated(ViewIcons));
				  SectionCanvas =wait.until(ExpectedConditions.visibilityOfElementLocated(SectionviewCanvas));
				  boolean status = SectionCanvas.isDisplayed();
				  if (status) {
						System.out.println("Section View is visible");
					} else {
						System.out.println("Section View is not visible");
					}
			  }
			 public void ClickRoofMenu()
			 {
				 
				 driver. findElement(LeftSideRoofMenuICon).click();
				 //String title = driver.findElement(RoofSectionTitle).getText();
				 //System.out.println(title);
			 }
			 
			 
			 public void ClickRoofTypeField()
			 { 
				 driver.findElement(SelectRoofType).click();
			 }
			 public void SelectPulpetRoofOption()
			 {
				 driver.findElement(SelectPulpet).click();
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
