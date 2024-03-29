package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private static WebElement element = null;

	WebDriver driver;
	// Locator for user name field

	// PageURL
	String BaseURL = "https://pilot.bygglov24.com";

	// Locator for password field
	By uName = By.xpath("//*[@id=\"Email\"]");

	// Locator for password field
	By pswd = By.xpath("//*[@id=\"Password\"]");

	// Locator for company field
	By companyDropdown = By.xpath("//*[@id=\"ddlCompanyList\"]");

	// Locator for login button
	By loginBtn = By.xpath("//*[@id=\"signIn\"]");

	// Locator for adminmenu
	By adminMenu = By.xpath("//*[@id=\"ddlUser\"]/div[2]/span");

	// Locator for logout
	By logOutMenu = By.xpath("//*[@id=\"ddlUserContent\"]/li[3]/a");

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void BaseURL() {
		driver.get(BaseURL);
	}

	public static WebDriver Lanchbrowser() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pilot.bygglov24.com");
		return driver;
	}

	// Method to enter username
	public void enterUsername(String user) {

		driver.findElement(uName).sendKeys(user);
	}

	// Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}

	// Method to select company
	public void selectCompany(String companyName) {
		WebElement CompanyDropDown = driver.findElement(companyDropdown);
		Select company = new Select(CompanyDropDown);
		company.selectByVisibleText(companyName);
	}

	// Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

	public void clickAdminMenu() {
		// Wait for txtBox to be visible, then send text
		// waitForVisibility(adminMenu);
		driver.findElement(adminMenu).click();
	}

	// Method to click logout
	public void clickLogoutMenu() {
		// waitForVisibility(logOutMenu);
		driver.findElement(logOutMenu).click();

	}

	public void CloseBrowser() {
		driver.close();
	}

	/*
	 * private void waitForVisibility(WebElement element) throws Error{ new
	 * WebDriverWait(driver, 60) .until(ExpectedConditions.visibilityOf(element)); }
	 */

}