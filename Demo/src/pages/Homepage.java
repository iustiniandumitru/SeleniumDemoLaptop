package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	
	WebElement element = null;
	
	public static WebElement findUsername(WebDriver driver) {
		//System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.name("j_username"));
		return element;
	}
	
	public static WebElement findPassword(WebDriver driver) {
			WebElement element = driver.findElement(By.name("j_password"));
			return element;
		
	}
	
	public static WebElement loginButton(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]"));
			return element;
		
	}
	
	public static WebElement pensiiFacultative(WebDriver driver) {
		WebElement element = driver.findElement(By.cssSelector("By.cssSelector(\"   CSS sel... driver.findElement(By.cssSelector(\\\"body.no-js:nth-child(2) div.tab-content:nth-child(11) div.tab-pane.active div.container div.col-sm-12.col-xs-12.col-md-4.sidebar div.row div.col-sm-6.col-xs-12.col-md-12.acceseaza-cont:nth-child(2) form:nth-child(2) > input.btn-orange:nth-child(3)\\\"))\\r\\n\" + \r\n" + 
				"			\"\");\r\n" + 
				""));
		return element;

		
	}
	
	
	
	

}
