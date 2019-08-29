package ro.nn;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.beust.jcommander.JCommander.Builder;

public class Login {
	
public static void main(String[] args) throws InterruptedException  {
		
	actionsfillFormUsingSendKeys();
	}

	
	/*@Test
    public void exempleIustin() throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.nndirect.ro/clients/");
        driver.manage().window().maximize();
        driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
        driver.findElementByName("j_password").sendKeys("Stella1923");
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@value='Login']").click();
        Thread.sleep(5000);      
        Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/a[1]"))
        actions.click(driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/a[1]"))
        //actions.moveToElement(driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/a[1]"), 20, 20)
        //.contextClick()
        .build()
        .perform();
        Thread.sleep(5000);
        driver.close();
    }
	
	/*@Test
	public void doubleClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		driver.findElementByName("j_password").sendKeys("Stella1923");
    	Thread.sleep(2000);
    	driver.findElementByXPath("//input[@value='Login']").click();
    	Thread.sleep(5000);      
    	Actions actions = new Actions(driver);
    	//actions.moveToElement((WebElement) driver.findElementsByCssSelector("body.no-js.ng-scope:nth-child(2) div.container:nth-child(2) div.ng-scope div.fullgray.ng-scope div.rightpay.up_over div.ng-scope table.fullTable.ng-scope td:nth-child(1) div.rightpay.up_over.ng-scope div.boxstyle.box_shadow div.boxtitle > span.light"))
    	actions.moveToElement(driver.findElementByXPath("//span[contains(text(),'Portofoliul')]"))
    	.doubleClick()
    	.build()
        .perform();
        Thread.sleep(5000);
        driver.close();
    
	}
	/*@Test
	public void actionsContextClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		driver.findElementByName("j_password").sendKeys("Stella1923");
    	Thread.sleep(2000);
    	driver.findElementByXPath("//input[@value='Login']").click();
    	Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	//actions.moveToElement(driver.findElementByXPath("//*[@id=\"ng-app\"]/ng-include/div[1]/div[2]/nav/ul[2]/li[1]/a"))
    	actions.contextClick(driver.findElementByXPath("//*[@id=\"ng-app\"]/ng-include/div[1]/div[2]/nav/ul[2]/li[1]/a"))
    	.build()
        .perform(); 	
    	
	}
	
	/*@Test
	public void actionsClickAndHoldAndRelease() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		driver.findElementByName("j_password").sendKeys("Stella1923");
    	Thread.sleep(2000);
    	driver.findElementByXPath("//input[@value='Login']").click();
    	Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	//actions.moveToElement(driver.findElementByXPath("//div[contains(text(),'64758101')]"))
    	actions.clickAndHold(driver.findElementByXPath("//*[@id=\"pagetitle\"]/span[1]"))
    	//.moveToElement(driver.findElementByXPath("//div[contains(text(),'19.570,99 Lei')]"))
    	.release(driver.findElementByXPath("//*[@id=\"pagetitle\"]/span[2]"))
    	.build()
    	.perform();
    	Thread.sleep(5000);
    	driver.close();	
}*/
	
	/*@Test
	public void actionsmoveByOffSet() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		driver.findElementByName("j_password").sendKeys("Stella1923");
    	Thread.sleep(2000);
    	driver.findElementByXPath("//input[@value='Login']").click();
    	Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	actions.moveByOffset(200, 200)
    	.contextClick()
    	.build()
    	.perform();
    	Thread.sleep(5000);
    	driver.close();
	
	
}*/
	/*@Test
	public void actionsDragandDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		//driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		//driver.findElementByName("j_password").sendKeys("Stella1923");
    	//Thread.sleep(2000);
    	//driver.findElementByXPath("//input[@value='Login']").click();
    	//Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(driver.findElementByXPath("//*[@id=\"draggable\"]"), 
    						driver.findElementByXPath("//*[@id=\"droppable\"]"))
    	.build()
    	.perform();
    	Thread.sleep(5000);
    	driver.close();	
	
	
}*/
	
	/*@Test
	public void actionsDragandDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		//driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
		//driver.findElementByName("j_password").sendKeys("Stella1923");
    	//Thread.sleep(2000);
    	//driver.findElementByXPath("//input[@value='Login']").click();
    	//Thread.sleep(5000);     
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(driver.findElementByXPath("//*[@id=\"draggable\"]"), 
    						driver.findElementByXPath("//*[@id=\"droppable\"]"))
    	.build()
    	.perform();
    	Thread.sleep(5000);
    	driver.close();	
	
	
}*/
	/*@Test
	public void actionskeysDownandKeysUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(driver.findElement(By.name("one")))
		.click(driver.findElement(By.name("six")))
		.keyUp(Keys.CONTROL)
		.build()
    	.perform();
    	Thread.sleep(2000);
    	driver.quit();	
		
} 
}*/
	
	/*@Test
	public void actionsSendKeys() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.END)
//		.perform();
//    	Thread.sleep(2000);
//    	actions.sendKeys(Keys.HOME)
//    	.perform();
		actions.sendKeys(driver.findElementByName("click"), Keys.ENTER)
		.build()
    	.perform();
    	Thread.sleep(2000);
    	driver.close();
	
	}*/
	
//	@Test
	public static void actionsfillFormUsingSendKeys() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.click(driver.findElementById("Email"))
		.sendKeys("test@a.com"+Keys.TAB)
		.sendKeys("Passw123"+Keys.TAB)
		.sendKeys("Passw123"+Keys.TAB)
		.build()
    	.perform();
    	Thread.sleep(2000);
    	driver.close();
		
		 	
	}
	
	
}
