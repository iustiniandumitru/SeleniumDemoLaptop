package test;

import java.util.concurrent.TimeUnit;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Wait;

import pages.HomepageObjects;
import pages.Pensii_Facultative;
import pages.Pensii_Obligatorii;

public class LoginTest {
	WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		loginTest();
		
	}
	
	public static void loginTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		HomepageObjects loginobjects = new HomepageObjects(driver);
		Pensii_Obligatorii pensiipdoi = new Pensii_Obligatorii(driver);
		Pensii_Facultative petrei = new Pensii_Facultative(driver);
		
		
		driver.get("https://www.nndirect.ro/clients/");
		
		
		loginobjects.completeUsername("iustin_rapid@yahoo.com");
		loginobjects.completePassword("Stella1923");
		loginobjects.pushLogin();
		//driver.manage().window().fullscreen();
		//pensiipdoi.clickPensiiOb();
		//pensiipdoi.clickVeziRaport();
		System.out.println("Am ajuns pana in timeouts");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Am trecut de timeout");
		Thread.sleep(5000);
		petrei.clickPtrei();
		//Thread.sleep(5000);
		//Actions actions = new Actions(driver);
    	//actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/ng-include[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")))
    	//.click()
		//actions.click(driver.findElement(By.cssSelector("#p3-navbarlink")))
    	//.build()
    	//.perform();
		Thread.sleep(5000);
		petrei.clikVeziRaport();
    	Thread.sleep(5000);
		driver.close();
		System.out.println("Test executat");
	}

	

}
