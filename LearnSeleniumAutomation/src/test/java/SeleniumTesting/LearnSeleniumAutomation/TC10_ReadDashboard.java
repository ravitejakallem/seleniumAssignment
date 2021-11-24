package SeleniumTesting.LearnSeleniumAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10_ReadDashboard extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		
		LoginPage OrangeOR = new LoginPage(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		String url = Driver.getCurrentUrl();
		
		String s1= Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).getText();
		
		System.out.println(s1);
		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		}
	
}
