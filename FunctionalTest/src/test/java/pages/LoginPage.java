package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private static WebElement element = null;
	
	WebDriver driver;
	//Locator for user name field
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
	By logOut = By.xpath("//*[@id=\"ddlUserContent\"]/li[12]/a");
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public LoginPage(WebDriver driver) {
	          this.driver = driver;
		}

		
		private void waitForVisibility(WebElement element) throws Error{
	           new WebDriverWait(driver, 60)
	                .until(ExpectedConditions.visibilityOf(element));
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
		driver.findElement(logOut).click();
	}
	
	
=======

public class LoginPage {
	
	WebDriver driver;
	//Locator for user name field
	By uName = By.xpath("//*[@id=\"Email\"]");
	//WebElement  uName = driver.findElement(By.id("Email"));
	
	//Locator for password field
	By pswd = By.xpath("//*[@id=\"Password\"]");
	//WebElement pswd = driver.findElement(By.id("Password"));
	
	//Locator for company field 
	By companyDropdown = By.xpath("//*[@id=\"ddlCompanyList\"]");
	
	//Locator for login button
	By loginBtn = By.xpath("//*[@id=\"signIn\"]");
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public LoginPage(WebDriver driver) {
	          this.driver = driver;
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
>>>>>>> refs/remotes/origin/main

}
