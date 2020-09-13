package pageObjects;

import org.openqa.selenium.By;

public class loginPage {
	public By email = By.id("Email");
	public By password = By.id("Password");
	public By log_in_button = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");
}
