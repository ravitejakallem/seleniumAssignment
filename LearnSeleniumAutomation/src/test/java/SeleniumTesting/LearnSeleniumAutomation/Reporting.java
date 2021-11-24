package SeleniumTesting.LearnSeleniumAutomation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class Reporting extends BaseClass implements ITestListener {
public void onTestStart(ITestResult result) {
		
		
	}
	 public void onTestSuccess(ITestResult result) {
		
		Shutterbug.shootPage(Driver, ScrollStrategy.WHOLE_PAGE,500,true).withName("FullPageScreenshotpass").save();
		
		
	}
	 public void onTestFailure(ITestResult result) {
		 
			Shutterbug.shootPage(Driver, ScrollStrategy.WHOLE_PAGE,500,true).withName("FullPageScreenshotFail").save();
			
		
	}
	 public void onTestSkipped(ITestResult result) {
		
		
	}
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	 public void onStart(ITestContext context) {
		
		
	}
	 public void onFinish(ITestContext context) {
		
		// xReport.flush();
	}

}