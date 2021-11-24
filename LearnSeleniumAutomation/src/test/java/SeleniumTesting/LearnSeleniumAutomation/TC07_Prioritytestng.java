package SeleniumTesting.LearnSeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07_Prioritytestng {
	
	ChromeDriver driver;
	@Test(priority=1)
	
	public void Login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElementByName("txtUsername").sendKeys("Admin");
	    driver.findElementByName("txtPassword").sendKeys("admin123");
	    driver.findElementByXPath("//input[@value='LOGIN']").click();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	@Test(priority=2)
	public void adminclick()
	{
		LoginPage lp = new LoginPage(driver);
		lp.clickadminmodule();
	}
}