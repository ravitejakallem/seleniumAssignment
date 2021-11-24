package SeleniumTesting.LearnSeleniumAutomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TC12_01_Retryanalyzer implements IRetryAnalyzer{

	private int retryCount=0;
	private static final int maxRetryCount=3;
	
	  public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	          retryCount++;
	          return true;
	        }
	        return false;

	
	
}
}