package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomepageObjects;
import pages.Pensii_Facultative;
import pages.Pensii_Obligatorii;

public class TestNGLoginTest2 {
	
		
		static WebDriver driver = null;
		
		@BeforeTest
		public static void setupTest() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
			
			//How to use DesiredCapabilities on Chrome driver:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			driver = new ChromeDriver();
			
		}
		
		@Test
		public void testLogin2() throws InterruptedException {
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
			Thread.sleep(5000);
			//Actions actions = new Actions(driver);
	    	//actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/ng-include[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")))
	    	//.click()
			//actions.click(driver.findElement(By.cssSelector("#p3-navbarlink")))
	    	//.build()
	    	//.perform();
			petrei.clikVeziRaport();
			
		}
		
		@Test
		public void testLogin3() throws InterruptedException {
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
			Thread.sleep(5000);
			//Actions actions = new Actions(driver);
	    	//actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/ng-include[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")))
	    	//.click()
			//actions.click(driver.findElement(By.cssSelector("#p3-navbarlink")))
	    	//.build()
	    	//.perform();
			petrei.clikVeziRaport();
			
		}
		@AfterTest
		public void endingTheTest() throws InterruptedException {
	    	Thread.sleep(5000);
			driver.close();
			System.out.println("Test executat");
		}
}

		

	


