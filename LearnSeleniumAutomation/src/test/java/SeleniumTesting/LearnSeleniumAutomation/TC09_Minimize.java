package SeleniumTesting.LearnSeleniumAutomation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC09_Minimize {
	//WebDriver Driver;
	//Loginpage lp;
	
	public static void main(String[] args) {
		WebDriver Driver;
		LoginPage lp;	
	
	//public void setup()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		lp = new LoginPage(Driver);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.manage().window().maximize();
		Driver.manage().window().setPosition(new Point(0, -1000));
		
	}
}
}