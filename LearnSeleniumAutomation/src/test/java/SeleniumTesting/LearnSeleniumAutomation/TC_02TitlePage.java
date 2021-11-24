package SeleniumTesting.LearnSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02TitlePage {

	WebDriver Driver;
	LoginPage lp;
	
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		lp = new LoginPage(Driver);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.manage().window().maximize();
		String title = Driver.getTitle();
		System.out.println("The title of the URL "+title);
		
	}

}