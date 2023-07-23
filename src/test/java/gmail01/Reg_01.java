package gmail01;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reg_01 {

WebDriver driver;

@BeforeClass
	public void setup() {
		
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	  
}
@Test(dataProvider="data1")
 public void GM(String fn,String ls,String un,String ps,String cps ) throws InterruptedException {

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//first name 
	WebElement p = driver.findElement(By.xpath("//input[@id='firstName']"));
	p.sendKeys(fn);
	 //last name
	WebElement h =  driver.findElement(By.xpath("//input[@id='lastName']"));
	h.sendKeys(ls);
    // user name
	WebElement s =  driver.findElement(By.xpath("//input[@id='username']"));
    // password
	 s.sendKeys(un);
	WebElement l =  driver.findElement(By.xpath("//input[@name='Passwd']"));
	l.sendKeys(ps);
	 // confirm password
	WebElement m = 	 driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	m.sendKeys(cps);
    //click on next


	 driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	 
	
	 WebElement o =  driver.findElement(By.xpath(""));
System.out.print(o.getText());
	 if(o.getText().equalsIgnoreCase("Privacy")) {
		 Thread.sleep(3000);
	driver.navigate().back();
	

		
		 
		 Assert.assertTrue(true);
		 
		 
	 }
	 
	 
	
	 
	 else {
		
		 driver.navigate().refresh();
		 
		 Assert.assertFalse(false);
		
	 }  
	
	 
	

		
	
	
 

}
@DataProvider(name = "data1")
 public Object dataprovider() throws Exception {
	 
	 String file ="C:\\SelinumWebdriver\\EXCELFILES\\Gmail.xlsx";
	 
	 XLUtility util = new XLUtility(file);
	  int row = util.getRowCount("sheet1");
	  int col = util.getCellCount("sheet1", 1);
	 
	  Object [][]data = new Object[row][col];
	  
	  for(int i = 1; i<=row; i++) {
		  for(int j =0 ;j<col; j++) {
			  data[i-1][j] = util.getCellData("sheet1", i, j);
		  }
	  }
	 
	return  data;
	 
 }
	
	
}
