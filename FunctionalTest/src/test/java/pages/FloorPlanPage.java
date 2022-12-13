package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloorPlanPage {

	WebDriver driver;

	// Locator for clicking wall menu
	By wall = By.xpath("//*[@id =\"wall_actv\"]");

	// Locator for clicking door menu
	By door = By.xpath("//*[@id=\"door_actv\"]");

	// Locator for clicking window menu
	By window = By.xpath("//*[@id=\"window_actv\"]");

	// Locator for clicking stair menu
	By stair = By.xpath("//*[@id=\"stair_nrml\"]");

	// Locator for room pending

	// Locator for furniture menu
	By furniture = By.xpath("//*[@id=\"furniture_actv\"]");

	// Locator for template menu pending

	// Locator for rooflevel menu
	By roofLevel = By.xpath("//*[@id=\"roof_actv\"]");

	// Locator for miscellaneous menu
	By miscellaneous = By.xpath("//*[@id=\"miscallenous_nrml\"]");

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

	// Method to click window menu
	public void misellaneousMenu() {
		driver.findElement(miscellaneous).click();
	}

}