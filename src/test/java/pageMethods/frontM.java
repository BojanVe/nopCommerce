package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.frontPage;

public class frontM extends frontPage{

	WebDriver driver;
	
	public frontM (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void navigateRegister() {
		driver.findElement(register_link).click();
	}
	public void navigateLogin() {
		driver.findElement(login_link).click();
	}
}
