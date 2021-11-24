package SeleniumTesting.LearnSeleniumAutomation;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC13_CapturingSS extends BaseClass {
	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		LoginPage OrangeOR = new LoginPage(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		OrangeOR.clickpimmodule();
		
		OrangeOR.pimenteremployeename("Linda anderson");
		
		OrangeOR.pinsearchempoyee();
		
		Thread.sleep(2000);
		
		
		
		
	}
	

	@Test(priority=2)
	public void fullPageScreenshot() throws IOException {
		
		String Filename = "OrangeFullPage";
		
		EventFiringWebDriver efw= new EventFiringWebDriver(Driver);
		 
		File f1= efw.getScreenshotAs(OutputType.FILE);
		File f2= new File("C:\\Users\\kallemr\\eclipse-workspace//LearnSeleniumAutomation//ScreenShot//" + Filename +".jpg");
		FileUtils.moveFile(f1, f2);
		
		/*Assert Screen = new Assert();
		Screenshot sshot = Screen.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(Driver);
		
		String Dest = System.getProperty("user.dir") + "/Screenshots/" + Filename + ".jpg";
		
		File FinalDestination = new File(Dest);
		
		ImageIO.write(sshot.getImage(), "jpg", FinalDestination);
			*/
	}
}