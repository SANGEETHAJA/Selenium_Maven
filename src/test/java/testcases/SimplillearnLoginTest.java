package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.beust.jcommander.Parameters;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Loginpage;

public class SimplillearnLoginTest extends BaseClass4ExtentReports

{
	@Test
	public void Test1()
	
	{
		test.log(LogStatus.INFO, "Test1 Started");
		Loginpage lp =new Loginpage(driver);
		lp.Login("abc@gmail.com","Sam$1234533333");
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActulError = Error.getText();
		String ExpectedError = "The email or password you have entered is invalid.";
		
		AssertJUnit.assertTrue(Error.isDisplayed());
		AssertJUnit.assertEquals(ActulError, ExpectedError);
	}
	
	//@Test
	//@Parameters({"uname","pwd"})
	//public void PositiveTestCase(String Username,String Password)
	//{
	//	 Loginpage lp =new Loginpage(driver);
	//	lp.Login( Username,Password);
	//}

	@Test
	public void Test3()
	{
		test.log(LogStatus.INFO, "Test3 Started");
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		Loginpage lp = new Loginpage(driver);
		lp.Login(UserName,Password);
	}
	
}
