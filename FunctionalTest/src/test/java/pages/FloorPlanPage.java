package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FloorPlanPage {

	WebDriver driver;

	// Locator for clicking wall menu
	By wall = By.id("wall_li_id");

	// Locator for clicking door menu
	By door = By.id("door_li_id");

	// Locator for clicking window menu
	By window = By.id("window_li_id");

	// Locator for clicking stair menu
	By stair = By.id("stair_li_id");
	
	// Locator for room type
	By Roomtype = By.id("roomtype_li_id");

	// Locator for furniture menu
	By furniture = By.id("furniture_li_id");

	// Locator for template menu pending
	By TemplateMenu = By.id("template_li_id");

	// Locator for rooflevel menu
	By roofLevel = By.id("roof_li_id");

	// Locator for miscellaneous menu
	By miscellaneous = By.id("miscallenous_li_id");
	
	// Locator for floorplan
		By floorPlan = By.xpath("//div[contains(@class,'floorPlanViewDiv')]");
		
	// Locator for innerwall
		By selectNonBearingWall = By.id("innerwall_li_id");
		
	// Locator for closeleft menu
		By closeLeftMenu = By.xpath(".//a[contains(@onclick, 'submenuClose('drlvl4')')]");

	// Constructor
	public FloorPlanPage(WebDriver driver) {
		this.driver = driver;
	}
	// Method to click wall menu
	public void clickWall() {
		driver.findElement(wall).click();
	}

	// Method to click door menu
	public void doorMenu() {
		driver.findElement(door).click();
	}

	// Method to click window menu
	public void windowMenu() {
		driver.findElement(window).click();
	}

	// Method to click stair menu
	public void stairMenu() {
		driver.findElement(stair).click();
	}

	// Method to click furniture menu
	public void furnitureMenu() {
		driver.findElement(furniture).click();
	}

	// Method to click rooflevel menu
	public void roofLevelMenu() {
		driver.findElement(roofLevel).click();
	}

	// Method to click misellaneous menu
	public void misellaneousMenu() {
		driver.findElement(miscellaneous).click();
	}
	// Method to close the left menu
	public void closeLeftMenu() {
		driver.findElement(closeLeftMenu).click();
	}

	public boolean AssertFloorPlanCheck() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(floorPlan));
		boolean status = element.isDisplayed();
		if (status) {
			System.out.println("Floorplan is visible");
		} else {
			System.out.println("Floorplan is not visible");
		}
		return status;
		}

}
