package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testunuwait {

	@Test
	private void psvm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
        driver.findElementByName("j_password").sendKeys("Stella1923");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//input[@value='Login']").click();
     // WebDriverWait wait = new WebDriverWait(driver, 20);
     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#p3-navbarlink")));
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("#p3-navbarlink")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 8);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.id("generate_report"))));
    	driver.findElement(By.id("generate_report")).click();
        Thread.sleep(5000);
        driver.close();
	}
	
}
