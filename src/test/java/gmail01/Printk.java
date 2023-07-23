package gmail01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.bbc.com/sport/football/premier-league/top-scorers");
		List<WebElement> s = driver.findElements(By.xpath("//table[@class='gs-o-table']//td"));
		
		
		for(WebElement n : s) {
			String l = n.getText();
		System.out.print(l+"  ");	
		
		}
		System.out.println();
		
		

	}

}
