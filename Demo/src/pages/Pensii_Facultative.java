package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pensii_Facultative {
	WebDriver driver = null;
	
	By pensii_facultative = By.cssSelector("#p3-navbarlink");
	By vezi_raport = By.id("generate_report");



	public Pensii_Facultative(WebDriver driver) {
		this.driver = driver;
		
	}

	public void clickPtrei() {
		driver.findElement(pensii_facultative).click();
		
	}
	
	public void clikVeziRaport() {
		driver.findElement(vezi_raport).click();
		
	}
}


