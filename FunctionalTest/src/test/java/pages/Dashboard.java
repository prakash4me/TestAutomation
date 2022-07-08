package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	WebDriver driver;
	
	// Locator for Create button 
	By createProject = By.xpath("//*[@id=\"tab-one\"]/div[1]/div[1]/a");
	
	public Dashboard(WebDriver driver) {
        this.driver = driver;
	}

	//Click method
	public void createProject() {
		driver.findElement(createProject).click();
	}
	
		
}
