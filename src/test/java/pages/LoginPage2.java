package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass1;

public class LoginPage2 extends BaseClass1
{

	WebDriver driver;
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Remeberme;
	
	@FindBy(name="btn_login")
	WebElement LogiBtn;
	
	public LoginPage2(WebDriver basedriver) {
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);
		
	}
	
	public void Login(String UserValues,String PasswordValues)
	{
		LoginLink.click();
		UserName.sendKeys("abs@gmail.com");
		Password.sendKeys("Sangeeta$123$");
		Remeberme.click();
		LogiBtn.click();
		
	}
	
}
