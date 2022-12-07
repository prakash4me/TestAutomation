package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	
	// Locator for Create button 
	By createProject = By.xpath("//*[@id=\"tab-one\"]/div[1]/div[1]/a");
	
	public DashboardPage(WebDriver driver) {
        this.driver = driver;
	}

	//Click method
	public void createProject() {
		driver.findElement(createProject).click();
	}
	
		
}
