package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Homepage;

public class Login {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		loginProcess();
		
	}
	
	public static void loginProcess() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		
		Homepage.findUsername(driver).sendKeys("iustin_rapid@yahoo.com");
		Homepage.findPassword(driver).sendKeys("Stella1923");
		Homepage.loginButton(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage.pensiiFacultative(driver).click();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("Test executat cu succes");
		driver.close();
		
	}

}
