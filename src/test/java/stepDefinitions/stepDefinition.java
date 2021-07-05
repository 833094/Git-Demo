package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepDefinition {
	public WebDriver driver;

    @Given("^user is on landing page \"([^\"]*)\"$")
    public void user_is_on_landing_page_something(String strArg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(strArg1);
    }

    @When("^user login into homepage with (.+) and (.+)$")
    public void user_login_into_homepage_with_and(String username, String password) throws Throwable {
		LoginPage l= new LoginPage(driver);
		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getLogin().click();
    }

    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
    }

    @And("^navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		if (lp.getPopupSize().size()>0)
		{
			lp.getPopup().click();
		}
		lp.getSignIn().click();

    }

}