package inputData;

import java.util.Random;

public class inputData {
	Random rnd = new Random();
	char c = (char) ('a' + rnd.nextInt(26));
	
	public String first_name_input = "Test";
	public String last_name_input = "Testovski";
	public String email_input = "auto_testing_"+c+"@gmail.com";
	public String password_input = "testingrules";
	public String confirm_password_input = "testingrules";
	public String company_name_input = "IWEC";
}
