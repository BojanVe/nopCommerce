package pageMethods;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;
import inputData.inputData;
import pageObjects.register;
import org.openqa.selenium.support.ui.Select;

import com.example.csv.WriteCsvFile;

public class registerM extends register{
	WebDriver driver;
	inputData ip = new inputData();

	public registerM (WebDriver driver) {
		this.driver = driver;
	}
	
	public void SelectGender() {
		driver.findElement(gender).click();
	}
	public void InputName() {
		driver.findElement(first_name).sendKeys(ip.first_name_input);
	}
	public void InputLastName() {
		driver.findElement(last_name).sendKeys(ip.last_name_input);
	}
	public void SelectDate() throws Throwable {
		
		Select day_select = new Select(driver.findElement(date_day));
		day_select.selectByVisibleText("11");
		
		Thread.sleep(1000);
		
		Select month_select = new Select(driver.findElement(date_month));
		month_select.selectByVisibleText("February");

		Thread.sleep(1000);
		
		Select year_select = new Select(driver.findElement(date_year));
		year_select.selectByVisibleText("1990");
		
	}
	public void InputEmail() throws FileNotFoundException, InterruptedException {
		driver.findElement(email).sendKeys(ip.email_input);
		
		
	}
	
	public void InputCompanyName() {
		driver.findElement(company).sendKeys(ip.company_name_input);
	}
	public void InputPassword() throws Throwable {
		driver.findElement(password).sendKeys(ip.password_input);
		
		PrintWriter out = new PrintWriter("email_and_pass.txt");
		Thread.sleep(1000);
		out.println("Used email is: "+ip.email_input+" and used password is: "+ip.password_input);
		Thread.sleep(1000);
		out.close();
		
		WriteCsvFile write = new WriteCsvFile();
		write.main(ip.email_input, ip.password_input);
		
		
	}
	public void InputConfirmPassword() {
		driver.findElement(confirm_password).sendKeys(ip.confirm_password_input);
		
	}
	public void ClickRegister() throws Throwable {
		driver.findElement(register_button).click();
		Thread.sleep(500);
	}
	public void AssertRegistration() {
		String registration_actual_message = driver.findElement(registration_message).getText();
	}
	
	
		
	
}
