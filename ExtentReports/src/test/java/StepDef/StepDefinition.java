package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("Provide browser details for opening chrome browser")
	public void provide_browser_details_for_opening_chrome_browser() {
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
	}
	@When("Open chrome browser")
	public void open_chrome_browser() {
	    driver.get("https://www.google.com/");
	}
	@Then("Validate weather browser is opened properly")
	public void validate_weather_browser_is_opened_properly() {
        System.out.println("Chrome Opened Successfully");
	}
	
	@When("Open bing browser")
	public void open_bing_browser() {
		driver.get("https://www.bing.com/");
	}
	@Then("Validate weather bing browser is opened properly")
	public void validate_weather_bing_browser_is_opened_properly() {
		   System.out.println("Bing Opened Successfully");
	}
	@When("Open yahoo browser")
	public void open_yahoo_browser() {
		driver.get("https://www.yahoo.com/");
	}
	@Then("Validate weather yahoo is opened properly")
	public void validate_weather_yahoo_is_opened_properly() {
		System.out.println("Yahoo Opened Successfully");
	}
}
