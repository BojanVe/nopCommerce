package stepDef;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageMethods.frontM;
import pageMethods.registerM;

import org.openqa.selenium.WebDriver;


import environment_Var.environmentVars;




public class Register_user extends environmentVars {
	

	@When("I navigate to page")
	public void i_navigate_to_page() throws Exception {
		
	    WebDriver driver = setProperty();
	  
	}

	@And("Click on register link")
	public void click_on_register_link() throws Throwable {
		frontM frontPage = new frontM(driver);
	    Thread.sleep(1000);
	    frontPage.navigateRegister();
	    Thread.sleep(1000);
	}

	@And("Enter my personal details respectively")
	public void enter_my_personal_details_respectively() throws Throwable {
		registerM reg = new registerM(driver);
		
		reg.SelectGender();	
		Thread.sleep(500);
		
		reg.InputName();
		Thread.sleep(500);
		
		reg.InputLastName();	
		Thread.sleep(500);
		
		reg.SelectDate();
		Thread.sleep(500);
		
		reg.InputEmail();
		Thread.sleep(500);
		
		reg.InputCompanyName();
		Thread.sleep(500);
		
		reg.InputPassword();
		Thread.sleep(500);
		
		reg.InputConfirmPassword();
		Thread.sleep(500);
	}

	@And("Click on Register button")
	public void click_on_Register_button() throws Throwable {
		registerM reg = new registerM(driver);
		
		reg.ClickRegister();
	}

	@And("I am successfully registered")
	public void i_am_successfully_registered() {
	    
	}
	
	
//	@After
//	public void tearDown() {
//		driver.quit();
//		
//	}
	

}
