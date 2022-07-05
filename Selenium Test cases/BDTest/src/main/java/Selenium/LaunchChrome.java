package Selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {
	

	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();

		//options.addExtensions(new File("F:\\chromedriver_win32\\chromedriver.exe"));

		//ChromeDriver driver = new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pilot.bygglov24.com/");
		System.out.println(driver.getTitle());

	}

}
