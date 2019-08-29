package ro.nn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selen {

	
	
	/*public static void testIustin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		driver.findElementByName("j_password").sendKeys("Stella1923");
    	Thread.sleep(2000);
    	driver.findElementByXPath("//input[@value='Login']").click();
    	Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(driver.findElementByXPath("//*[@id=\"draggable\"]"), 
    						driver.findElementByXPath("//*[@id=\"droppable\"]"))
    	.build()
    	.perform();
    	Thread.sleep(5000);
    	driver.close();	
      }*/
	@Test
	public static void testIustin2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		By login_username = By.className("j_username");
		By login_password = By.className("j_password");
		
		
	}

	
	
	
		
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		/*try {
			testIustin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		testIustin2();
		
		
		
		
		
		
		
		
		
		
	//TRY CATCH - CURS 16	
		
			/*try {	
				System.out.println("Hai Rapid !");
				int i = 1/0;
				System.out.println("Completat cu succes");
			}
			catch(Exception exp){
				System.out.println("Suntem in interiorul exceptiei");
				System.out.println("Message is: "+exp.getMessage());
				System.out.println("Cause is: "+exp.getCause());
				exp.printStackTrace();
			}
			finally {
				System.out.println("Am iesit din exceptie");
			}
			}

	}*/
		
	}
}

	
	


