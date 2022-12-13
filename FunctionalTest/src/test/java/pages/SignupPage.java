package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.manage();
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignupPage {

	
	  WebDriver driver = null;
      Random r = new Random();
	  String randomNumber = String.format("%04d", r.nextInt(1001));
	    
	  
	 //Signup option locator from login page 
	  By clickSignupLink = By.xpath("//a[text()='Skapa konto']"); 
	  
	  //private WebElement clickSignupLink;
	 @FindBy(xpath ="//a[text()='Skapa konto']") private WebElement Signuplink;
	 
	 //Locator for First name
	 By FirstNameSignup = By.id("FirstName"); 
	 //Locator for last name
	 By LastnameSignup = By.id("LastName");  
	 //Locator for Email Id
	 By EmailIdSignUp = By.id("Email"); 
	 //Locator for Password
	 By PasswordSignup = By.id("Password");
	 //Locator for Confirm password
	 By ConfirmPassword = By.id("ConfirmPassword");
	 //Locator for select company
	 By SelectCompanySignup = By.id("ddlCompanyList");
	 //Locator for privacy policy
	 By PrivacyPolicyCheckbox = By.id("IsPrivacyPolicy");
	 //Locator for Signup button
	 By SignupButton = By.id("signUp"); 
	 //Locator for Dashboard my Project menu
	 //By MyProject = By.xpath("//a[text()='Mina projekt']");
	 By MyProject = By.id("dashboard-container");
	
	 //Locator for Create new pop-up
	 By CreateNewProjectPopup = By.id("createProjectPopup");
	 //Locator for New Construction radio button selected
	 By NewConstructionRadioButton = By.id("constructionType1");
	//Locator for Attefall Construction radio button selected
     By AttefallConstructionRadioButton = By.id("constructionType2");
	 
	 
	 StringBuilder Firstname = new StringBuilder().append(randomNumber).append("Automation");
	 String Lastname ="Tester";
	 StringBuilder Email = new StringBuilder().append(randomNumber).append("automationtester@asteroidsoft.com");
	 String Password ="qwerty123";
	  
	  public SignupPage(WebDriver driver) 
	  { 
		  this.driver = driver; 
		  } 
	 
	//click signup link
	  public void clickSignupLinkfromlogin() { 
	  driver.findElement(clickSignupLink).click(); 
	  }
	 
	  public void Firstname() {
		  		  driver.findElement(FirstNameSignup).sendKeys(Firstname);
	  }
	  public void Lastname() {
		  driver.findElement(LastnameSignup).sendKeys(Lastname);
	  }
	  public void Email() {
		  driver.findElement(EmailIdSignUp).sendKeys(Email);
	  }
	  public void Password() {
		  driver.findElement(PasswordSignup).sendKeys(Password);
	  }
	  public void ConfirmPassword() {
		  driver.findElement(ConfirmPassword).sendKeys(Password);
	  }
	  public void selectCompany(String companyName) {
		  WebElement CompanyDropDown = driver.findElement(SelectCompanySignup);  
		  Select Company = new Select(CompanyDropDown); 
		  Company.selectByValue(companyName);
	  }
	  public void PrivacyPolicy() {
		  driver.findElement(PrivacyPolicyCheckbox).click();
	  }
		
	  public void ClickSubmit() {
		  driver.findElement(SignupButton).click();
	  }
	  
	  public void AssertNewProjectPopupCheck() {
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  WebElement CreatePopup=wait.until(ExpectedConditions.visibilityOfElementLocated(CreateNewProjectPopup));
		  boolean status = CreatePopup.isDisplayed();
		  if (status) {
				System.out.println("CreatePopup is visible");
			} else {
				System.out.println("CreatePopup is not visible");
			}
	  }
	  public void AssertDashboardCheck() {
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(MyProject));
		  boolean status = element.isDisplayed();
		  if (status) {
				System.out.println("Dashboard is visible");
			} else {
				System.out.println("Dashboard is not visible");
			}
	  
	  }
	  
		public void AssertConstructionTypeCheck() {
			
			 WebDriverWait wait=new WebDriverWait(driver,20);
			  WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(NewConstructionRadioButton));
			  WebElement element1 = driver.findElement(AttefallConstructionRadioButton);
			  if (element.isSelected()) {
					System.out.println("Signup with other than attefall company selected");
				} else if (element1.isSelected()) {
					System.out.println("Signup with attefall company selected");
				}
	}
	}
