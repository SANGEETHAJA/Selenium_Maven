package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 
{
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)//it will be excecuted before each test case
	public void Setup()//is a method for initialization steps
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		
	}
	@AfterMethod(alwaysRun=true)//it will be executed after each test case
	public void TearDown()//is a method to clear things
	{
		 driver.close();
	}
}
