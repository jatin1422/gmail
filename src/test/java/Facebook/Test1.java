package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser","url"})
	public void setup(String browser ,String url) {
		
	if(browser.equalsIgnoreCase("Chrome"))
		
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	}
	
	else  {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
		System.out.println("open the Browser");
		driver.get(url);
		
	}
	@Test(priority=1)
	public void login() {
	
		System.out.println("Login");
	}
	@Test(priority=2)
	public void logout() {
		
		System.out.println("logout");

	}
	@AfterTest
	public void teardown() {
		System.out.println("Tear down succesfully");

	}
}
