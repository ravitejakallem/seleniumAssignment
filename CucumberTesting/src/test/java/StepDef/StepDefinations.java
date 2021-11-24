package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Orangepages;

public class StepDefinations {
	WebDriver Driver;
	Orangepages OrangeOR;

	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application()  {
	    // Write code here that turns the phrase above into concrete actions

		
		String title = Driver.getTitle();
		if (title.contains("OrangeHRM"))
		{
			System.out.println("User is on the orange Login page");
		}
	}

	@Then("^Login to Application$")
	public void login_to_Application()  {
		OrangeOR.EnterUsername("Admin");
		OrangeOR.Enterpwd("admin123");
		OrangeOR.clickloginbtn();
	    
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available()  {
		 String actdasbhoardurl=Driver.getCurrentUrl();
		 String expdasbhoardurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		 Assert.assertEquals(expdasbhoardurl, actdasbhoardurl);
	   
	}

	
	@Then("^Close the Browser$")
	public void close_the_Browser() {
	  
		Driver.close();
	}
	@Given("^When I am in Admin page$")
	public void when_I_am_in_Admin_page()  {
	    String currenturl=Driver.getCurrentUrl();
	    if (currenturl.contains("admin"))
	    System.out.println("user is on the Admin page");
	}


@Given("^the user opens the browser$")
public void the_user_opens_the_browser() {
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
	OrangeOR = new Orangepages(Driver);
}

@Then("^the user runs the URL$")
public void the_user_runs_the_URL()  {
	Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
}

@Then("^click on Admin module$")
public void click_on_Admin_module()  {
	OrangeOR.clickadminmodule();
    
}

@Then("^click on Job title$")
public void click_on_Job_title() throws InterruptedException  {
	Actions actions = new Actions(Driver);
	WebElement job=Driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
	actions.moveToElement(job).perform();
	Thread.sleep(3000);
	WebElement jobtitlelink = Driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']"));
	jobtitlelink.click();
}

@Then("^Verify the job title page$")
public void verify_the_job_title_page()  {
	 String expjobtitle=OrangeOR.verifyjobtitle();
	   String actjobtitle="Job Titles";
	   Assert.assertEquals(expjobtitle, actjobtitle);
	   System.out.println("User is on the Job title page");
    
}

@Then("^click on leave module$")
public void click_on_leave_module()  {
    // Write code here that turns the phrase above into concrete actions
	OrangeOR.clickadminmodule();
	
    
}

/*@Then("^click on my leave module$")
public void click_on_my_leave_module() {
    // Write code here that turns the phrase above into concrete actions
	OrangeOR.clickmyleavelink();
}
@Then("^verify the my leave page$")
public void verify_the_my_leave_page()  {
    // Write code here that turns the phrase above into concrete actions
	String verleavetext=OrangeOR.verifymyleavelink();
	Assert.assertEquals("My Leave List", verleavetext);
}*/

@Then("^click on pim module$")
public void click_on_pim_module() {
    // Write code here that turns the phrase above into concrete actions
	OrangeOR.clickpimlink();
}

@Then("^click on employee list module$")
public void click_on_employee_list_module() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	OrangeOR.clickemplink();
}

@Then("^verify the employee list page$")
public void verify_the_employee_list_page()  {
    // Write code here that turns the phrase above into concrete actions
	
	String veremployeelist=OrangeOR.verifyemplinktext();
	Assert.assertEquals("Employee Information", veremployeelist);
    
}
}