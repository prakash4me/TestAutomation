package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
