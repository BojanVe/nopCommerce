package pageObjects;


import org.openqa.selenium.By;

public class register {

		public static By title = By.xpath("//*[@class='page-title']/h1");
		public static By gender  = By.xpath("//input[@id='gender-male' and @type='radio']");
		public By first_name = By.id("FirstName");
		public By last_name = By.id("LastName");
		public By date_day = By.name("DateOfBirthDay");
		public By date_month = By.name("DateOfBirthMonth");
		public By date_year = By.name("DateOfBirthYear");
		public By email = By.id("Email");
		public By company = By.id("Company");
		public By newsletter = By.id("Newsletter");
		public By password = By.id("Password");
		public By confirm_password = By.id("ConfirmPassword");
		public By register_button = By.id("register-button");
		public By registration_message = By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]");
		public String registration_expected_message = "Your registration completed";	
}
