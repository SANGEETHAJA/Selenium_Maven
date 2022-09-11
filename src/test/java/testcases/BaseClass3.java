package testcases;

	import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	public class BaseClass3 
	{
	
		public WebDriver driver;
		public XSSFWorkbook wbook;
		public XSSFSheet sheet;
		
		@BeforeTest
		public void DataSetUp() throws IOException
		{
			FileInputStream fis = new FileInputStream("exceldata.xlsx");
			wbook=new XSSFWorkbook(fis);
			sheet =wbook.getSheet("Sheet1"); 
			
		}
		
		@AfterTest
		public void DataClean() throws IOException
		{
			wbook.close();
		}
		
		
		
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

