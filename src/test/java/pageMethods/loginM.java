package pageMethods;

import org.openqa.selenium.WebDriver;

import com.example.csv.ReadCsvFile;

import inputData.inputData;
import pageObjects.loginPage;

public class loginM extends loginPage{
	WebDriver driver;
	
	public  loginM (WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterEmail() {
		inputData in = new inputData();
		driver.findElement(email).sendKeys("auto_testing_n@gmail.com");
	}
	public void EnterPassword() {
		inputData in = new inputData();
		driver.findElement(password).sendKeys("testingrules");
	}
	public void ClickLogin() {
		driver.findElement(log_in_button).click();
	}

}
