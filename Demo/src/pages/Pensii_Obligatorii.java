package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pensii_Obligatorii {
	WebDriver driver = null;
	
	By pensii_obligatorii = By.cssSelector("#p2-navbarlink");
	By vezi_raport = By.className("button orange_right fleft cursor dagnyDisplay");
	
	
	public Pensii_Obligatorii(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickPensiiOb() {
		
		driver.findElement(pensii_obligatorii).click();
		
	}
	
	public void clickVeziRaport() {
		
		driver.findElement(vezi_raport).click();
		
	}
	
	
}
