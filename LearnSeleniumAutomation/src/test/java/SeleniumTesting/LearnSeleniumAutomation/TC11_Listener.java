package SeleniumTesting.LearnSeleniumAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11_Listener extends BaseClass {
	@Test(priority=1) //Pass Test Case
	public void verifytextpass() throws InterruptedException
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
	
	@Test(priority=2) //Fail Test Case
	public void verifytextfail() throws InterruptedException
	{
		
		
		String url = Driver.getCurrentUrl();
		
		String s1= Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).getText();
		
		System.out.println(s1);
		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashbo");
		
		
		}
	
}