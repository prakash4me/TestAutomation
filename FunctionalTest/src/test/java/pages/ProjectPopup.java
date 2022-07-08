package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPopup {
	
	WebDriver driver;
	
  // Locator for constructiontype 
	By constructionType = By.xpath("//*[@id=\"create-project-section\"]/div[2]/div[3]/div[12]/div/label");
	
	//Locator for create button
	By createProject = By.xpath("//*[@id=\'btnReady\']");
  	
 public ProjectPopup(WebDriver driver)
 {
	this.driver = driver; 
 }
 
 public void selectConstructionType()
 {
	 driver.findElement(constructionType).click();
 }
 
 public void selectFloorType()
 {
	 /*
	 System.out.println("Action class start");
	 Actions actions = new Actions(driver);
	 System.out.println("Action class start1");
	 actions.moveToElement(floorType).click();
	 System.out.println("Action class start2");
	 */
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("document.querySelector('#Loft > div.img-column-img-div').click()");
	 		
	 
 }
 
 public void selectShape()
 {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("document.querySelector(\'#LShape\').click()");
	 // document.querySelector("#LShape > div > img")
 }
 
 public void clickCreate()
 {
	 
	 driver.findElement(createProject).click();
	 
 }
}
