package BDTestPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class LoginTest {

	WebDriver driver = new ChromeDriver();
	@Test
	public void testLogin() {
		System.out.println(".. Hi");
	}

}
