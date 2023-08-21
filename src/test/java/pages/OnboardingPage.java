package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinations.Onboarding;

public class OnboardingPage extends Onboarding{
	
	
	public OnboardingPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="sports tabe")
	public static WebElement sportsTab;
	

}
