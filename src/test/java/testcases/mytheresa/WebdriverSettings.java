package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
