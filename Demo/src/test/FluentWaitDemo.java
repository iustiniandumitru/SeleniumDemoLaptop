package test;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluentWaitDemo {

	@Test
	public void fluentWait() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//fk80wa//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nndirect.ro/clients/");
		driver.manage().window().maximize();
		driver.findElementByClassName("form-control").sendKeys("iustin_rapid@yahoo.com");  
        driver.findElementByName("j_password").sendKeys("Stella1923");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//input[@value='Login']").click();
        System.out.println("inainte de fluent wait");
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(20, TimeUnit.SECONDS)
        		.pollingEvery(2,TimeUnit.SECONDS)
        		.ignoring(ElementNotVisibleException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
              WebElement linkElement =  driver.findElement(By.cssSelector("#p3-navbarlink"));
              
              if(linkElement.isEnabled()) {
            	  System.out.println("Element found");
            	  
              }
              return linkElement;
            }
          }); 
        Actions actions = new Actions (driver);
        actions.moveToElement(element);
        actions.click();
        actions.perform();
        //element.click();
        //element.sendKeys(Keys.RETURN);
        //driver.findElement(By.cssSelector("#p3-navbarlink")).click();
       // driver.findElement(By.id("generate_report")).click();
        System.out.println("test executat cu succes!!");
        Thread.sleep(5000);
        driver.close();
	}
}
