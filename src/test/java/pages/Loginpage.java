package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage
{
	WebDriver driver;
	public Loginpage(WebDriver basedriver) 
	{
		this.driver = basedriver;
	}
	public void Login(String UserValues,String PasswordValues)
	{
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserValues);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordValues);
		
		WebElement Remeberme = driver.findElement(By.className("rememberMe"));
		Remeberme.click();
		
		WebElement LogiBtn = driver.findElement(By.name("btn_login"));
		LogiBtn.click();
	}

}
