package Facebook;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	WebDriver driver;

	@BeforeClass
		public void setup() throws InterruptedException {
			
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804791&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D9050531%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMItJGH3uWM_AIVbZhmAh2I6wEoEAAYASAAEgIPZfD_BwE");
		  Thread.sleep(5000);
	}
	

	@Test(dataProvider ="logindata")
	public void reg(String firstname,String lastname, String mobilenumber , String password,String date, String month , String year, String Gender, String customerindex , String genderindex) throws Exception {
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='u_3_b_TL']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='u_3_d_JV']")).sendKeys(lastname);
		
		
		driver.findElement(By.xpath("//input[@id='u_3_g_qC']")).sendKeys(mobilenumber);
       driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(password);
		
	WebElement dr =	driver.findElement(By.xpath("//select[@id='day']"));
	dr.click();
	 
	Select sl = new Select(dr);
	sl.selectByValue("date");
	
	
	WebElement mon= driver.findElement(By.xpath("//select[@id='month']"));
	
	Select sm = new Select(mon);
	sl.selectByValue("month");
	
	//Year
	WebElement yr	= driver.findElement(By.xpath("//select[@id='year']"));
	Select sr = new Select(yr);
	sl.selectByValue("year");
	
	if(Gender.equals("Female")) {
  WebElement dd =driver.findElement(By.xpath("//label[@for='u_3_4_jv']"));
  
  dd.click();
	}
  
	else if(Gender.equals("Male")) {
WebElement dt = driver.findElement(By.xpath("//input[@id='u_3_4_jv']"));
dt.click();
  }
	else if(Gender.equals("Custom")) {
		WebElement dtd =	driver.findElement(By.xpath("//label[@for='u_3_6_si']"));
		dtd.click();
		Select lm = new Select(dtd);
		lm.selectByValue(customerindex);
		driver.findElement(By.xpath("//input[@id='u_3_q_Up']")).sendKeys(genderindex);
		
		}
	
	driver.findElement(By.xpath("//button[@id='u_3_s_0a']")).click();
	
	if(driver.getTitle().equals(" Facebook")) {
		
		Assert.assertTrue(true);
		  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804791&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D9050531%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMItJGH3uWM_AIVbZhmAh2I6wEoEAAYASAAEgIPZfD_BwE");

		
	}
	
	else{
		Assert.assertFalse(false);
		  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804791&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D9050531%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMItJGH3uWM_AIVbZhmAh2I6wEoEAAYASAAEgIPZfD_BwE");

	}
	
	}
	
	
	@DataProvider(name="data")
	public Object[][]data() throws Exception{
		
		String path = "C:\\SelinumWebdriver\\EXCELFILES\\FBregistration.xlsx";
		
		XLUtility util = new XLUtility (path);
		
		int row = util.getRowCount("sheet1");
		int col = util .getCellCount("sheet1", 1);
		 Object logindata [][]=new Object[row][col];
		
		for(int i =1 ; i<=row;i++) {
			for(int j =0; j<col;j++) {
				
				logindata [i-1][j]=util.getCellData("Sheet1", i, j);	
			}
		}
		return logindata ;
	}

}

	
	











