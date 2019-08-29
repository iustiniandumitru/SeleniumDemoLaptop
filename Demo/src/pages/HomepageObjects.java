package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageObjects {
	
	WebDriver driver = null;
	
	By login_username = By.name("j_username");
	
	By login_password = By.name("j_password");
	
	By login_button = By.xpath("//*[@id=\"command\"]/input[1]");
	

public HomepageObjects(WebDriver driver) {
		this.driver = driver;
	
}


public void completeUsername(String text) {
		
		driver.findElement(login_username).sendKeys(text);
	
}

public void completePassword(String text) {
	
		driver.findElement(login_password).sendKeys(text);	
	
	
}

public void pushLogin() {
	
	driver.findElement(login_button).click();
}
	
	
}


