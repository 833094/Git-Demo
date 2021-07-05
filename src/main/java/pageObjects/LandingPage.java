package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public  WebDriver driver;
	
	private By signin=By.cssSelector("a[href*='sign_in']");
	private By popup= By.xpath("//button[@text()='NO THANKS']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
		 
	
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	public List<WebElement> getPopupSize()
	{
		return driver.findElements(popup);
	}
	public WebElement getSignIn()
	{
		return driver.findElement(signin);
	}
	
	
}
