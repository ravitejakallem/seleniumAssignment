package SeleniumTesting.LearnSeleniumAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC14_CSSselector extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		
		LoginPage OrangeOR = new LoginPage(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("img[src='/webres_6051af48107ce6.31500353/orangehrmLeavePlugin/images/ApplyLeave.png']")).click();
		OrangeOR.clickdashboardmodule();
		Driver.findElement(By.cssSelector("img[src='/webres_6051af48107ce6.31500353/orangehrmTimePlugin/images/MyTimesheet.png']")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_pim_viewPimModule]")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_time_viewTimeModule]")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_maintenance_purgeEmployee]")).click();
		

		}
}