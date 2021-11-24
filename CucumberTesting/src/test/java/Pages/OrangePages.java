package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePages {
	WebDriver Driver;
	@FindBy(id="txtUsername")
	WebElement username;
	public void EnterUsername(String usernm)
	{
		username.sendKeys(usernm);
	}
	
	@FindBy(id="txtPassword")
	WebElement password;
	public void Enterpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminmodule;
	public void clickadminmodule()
	{
		adminmodule.click();
	}
	
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement jobtitlelink;
	public void clickjobtitle()
	{
		jobtitlelink.click();
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h1[1]")
	WebElement jobtitlepage;
	public String verifyjobtitle()
	{
		return jobtitlepage.getText();
	}
	

	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimlink;
	public void clickpimlink()
	{
		pimlink.click();
	}
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement emplistlink;
	public void clickemplink()
	{
		emplistlink.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Employee Information')]")
	WebElement emplisttext;
	public String verifyemplinktext()
	{
		return emplisttext.getText();
	}
	
	//id="menu_leave_viewLeaveModule"
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leavelink;
	public void clickleavelink()
	{
		leavelink.click();
	}
	
	//id="menu_leave_viewMyLeaveList"
	
	@FindBy(id="menu_leave_viewMyLeaveList")
	WebElement myleavelink;
	public void clickmyleavelink()
	{
		myleavelink.click();
	}
	
////h1[contains(text(),'Leave List')]
	@FindBy(xpath="//h1[contains(text(),'Leave List')]")
	WebElement leavelinktext;
	public String verifymyleavelink()
	{
		return leavelinktext.getText();
	}
	
public OrangePages(WebDriver Driver)

	{
	 this.Driver = Driver;
     PageFactory.initElements(Driver, this);
	}
}