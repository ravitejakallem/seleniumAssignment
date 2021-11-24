package SeleniumTesting.LearnSeleniumAutomation;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_LoginpageAll {

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
		List<WebElement> img= lp.getimageelements();
		
		for(WebElement imageFromList:img){
		     Dimension ImageUrl=imageFromList.getSize();
		     System.out.println(ImageUrl); 
		}
		
		List<WebElement> txt= lp.gettextboxelements();
		
		for(WebElement textFromList:txt){
		     String textstrings=textFromList.toString();
		     System.out.println(textstrings);
		}
		List<WebElement> hypertxt= lp.getAllLinks();
		
		for(WebElement textFromList1:hypertxt){
		     String hypertexts=textFromList1.getText();
		     System.out.println(hypertexts);
		}
		
		
		
		}
		
	@Test
	public void teardown()
	{
		Driver.close();
	}

}