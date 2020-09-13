package environment_Var;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class environmentVars {

	public static WebDriver driver;
	public static String browser = "firefox";
	public static String url = "https://demo.nopcommerce.com/";
			
			protected static WebDriver setProperty() {
				if (browser.toLowerCase().contains("firefox")){
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get(url);
				}
				else if (browser.toLowerCase().contains("chrome")){
						System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
						driver = new FirefoxDriver();
						driver.manage().window().maximize();
						driver.get(url);
					}
				return driver;
				
		
	}
}
