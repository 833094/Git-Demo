package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	public static WebDriver driver;


	public WebDriver initializeDriver()   {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		return driver = new ChromeDriver();


	}



}
