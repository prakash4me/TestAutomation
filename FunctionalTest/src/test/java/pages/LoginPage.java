package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private static WebElement element = null;
	
	static WebDriver driver;
	//Locator for user name field
	
	//PageURL
 String BaseURL = "https://pilot.bygglov24.com";
	
	
	By uName = By.xpath("//*[@id=\"Email\"]");
	//WebElement  uName = driver.findElement(By.id("Email"));
	
	//Locator for password field
	By pswd = By.xpath("//*[@id=\"Password\"]");
	//WebElement pswd = driver.findElement(By.id("Password"));
	
	//Locator for company field 
	By companyDropdown = By.xpath("//*[@id=\"ddlCompanyList\"]");
	
	//Locator for login button
	By loginBtn = By.xpath("//*[@id=\"signIn\"]");
	
	//Locating the admin menu 
	
	
	@FindBy(xpath ="//*[@id=\"ddlUser\"]/div[2]/span]")
	private WebElement adminMenu;
	
	//Locator for logout  
	@FindBy (xpath="//*[@id=\"ddlUserContent\"]/li[12]/a")
	private WebElement logOutMenu;
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public LoginPage(WebDriver driver) {
	          this.driver = driver;
		}

		
		private void waitForVisibility(WebElement element) throws Error{
	           new WebDriverWait(driver, 60)
	                .until(ExpectedConditions.visibilityOf(element));
	    }
		
		public void BaseURL() {
			driver.get(BaseURL);
		}
		
		public void ClosePage() {
			driver.close();
		}
		
			
	//Method to enter username
	public void enterUsername(String user) {
		
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	/*
	//Method to select company
	public void selectCompany(String companyName) {
		Select company = new Select(companyDropdown);
		company.selectByVisibleText(companyName);
	}
	*/
	
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	public void clickAdminMenu(){
        // Wait for txtBox to be visible, then send text
        waitForVisibility(adminMenu);
        adminMenu.click();
	}
	
	//Method to click logout
	public void clickLogoutMenu() {
		waitForVisibility(logOutMenu);
		logOutMenu.click();
	}


	
	
}