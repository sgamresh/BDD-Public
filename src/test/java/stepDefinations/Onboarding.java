package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.OnboardingPage;

public class Onboarding {
	
	public ChromeDriver driver;
	
	@Given("User is able to launch the application")
	public void user_is_able_to_launch_the_application() {
	    
		WebDriverManager.chromedriver().setup();
		
		  driver = new ChromeDriver();
		
		driver.get("https://qatest.cloud/");
		
	}

	@Given("User lands on the home page")
	public void user_lands_on_the_home_page() {
		OnboardingPage ob= new OnboardingPage(driver);
	
		ob.sportsTab.click();
		
		
		
		driver.get("https://www.google.com/");
		
	}

	@When("I click on {string} tab")
	public void i_click_on_tab(String string) {
	   
		System.out.println("User cliked on : "+string);
		
		
	}

	@When("refrsh the page")
	public void refrsh_the_page() {
	    
		System.out.println("User refreshed the page");

		
	}

	@Then("I validate title of the {string} tab")
	public void i_validate_title_of_the_tab(String string) {
		System.out.println("User Validated tab switch on : "+string);

	}

	@Then("quit the browser")
	public void quit_the_browser() {
	    
		driver.quit();
	}



}
