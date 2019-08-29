package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChrome {
	
	@Test
	public void demoHdChrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");		
			
		WebDriver driver = new ChromeDriver(options); 
		
		
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		
		driver.close();
		driver.quit();
		System.out.println("Test executat");
		
		
	}
			
			

}
