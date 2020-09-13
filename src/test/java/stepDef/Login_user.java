package stepDef;

import org.openqa.selenium.WebDriver;

import environment_Var.environmentVars;
import io.cucumber.java.en.*;
import pageMethods.frontM;
import pageMethods.loginM;

public class Login_user extends environmentVars {
	@When("I am navigated to login page")
	public void i_am_navigated_to_login_page() throws InterruptedException {
		WebDriver driver = setProperty();
		Thread.sleep(500);
		frontM front = new frontM(driver);
		front.navigateLogin();
		Thread.sleep(500);
	}

	@And("I enter valid credentials")
	public void i_enter_valid_credentials() {
	    loginM log = new loginM(driver);
	    log.EnterEmail();
	    log.EnterPassword();
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
	    loginM log = new loginM(driver);
	    log.ClickLogin();

	}

	@Then("I am successfully logged")
	public void i_am_successfully_logged() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
