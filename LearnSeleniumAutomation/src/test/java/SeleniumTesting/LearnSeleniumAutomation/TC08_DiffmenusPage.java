package SeleniumTesting.LearnSeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC08_DiffmenusPage extends BaseClass{

	@Test
	public void login() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(Driver);
		lp.EnterUsername(username);
		lp.Enterpwd(pwd);
		lp.clickloginbtn();
		Thread.sleep(2000);
		lp.clickadminmodule();
		String Adminpagetitle= Driver.getTitle();
		System.out.println(Adminpagetitle);
		
		lp.clickpimmodule();
		String pimpagetitle= Driver.getTitle();
		System.out.println(pimpagetitle);
		
		lp.clickleavemodule();
		String Leavepagetitle= Driver.getTitle();
		System.out.println(Leavepagetitle);
		
		lp.clickdashboardmodule();
		String dashboardpagetitle= Driver.getTitle();
		System.out.println(dashboardpagetitle);
		
		lp.clickdirectorymodule();
		String directorypagetitle= Driver.getTitle();
		System.out.println(directorypagetitle);
		
		lp.clickmaintenancemodule();
		String maintenancepagetitle= Driver.getTitle();
		System.out.println(maintenancepagetitle);
		
	}
}
