package gmail01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//hello good night
		

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.bbc.com/sport/football/premier-league/top-scorers");
<<<<<<< HEAD
=======
		driver.get("https://www.bbc.com/sport/football/premier-league/top-scorers");
	
>>>>>>> 5870c218a4689a06fb45766b4fd1f8edbf9c9aeb


	
	  int row =driver.findElements(By.xpath("//table[@class='gs-o-table']//tr")).size();
	 int col = driver.findElements(By.xpath("//table[@class='gs-o-table']//tr[1]//td")).size();
	
	for(int i = 1 ;i <row; i++)
	 {
		 for(int c=1;c<=col;c++)
		 {
			 
			 
				String value = driver.findElement(By.xpath("//table[@class='gs-o-table']//tr["+i+"]//td["+c+"]")).getText();
					  System.out.print(value+"                ");
					  
					  
		}
	System.out.println()	; 
	 
	 }
		
		
		
	}}


