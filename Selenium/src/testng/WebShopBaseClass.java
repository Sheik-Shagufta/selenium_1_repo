package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class WebShopBaseClass {
	 WebDriver driver;
	 Properties prop;
	 Workbook workbook;
	 @BeforeTest
	 public void fetchdata() throws IOException
	 {
		 //property file
		 FileInputStream fis=new FileInputStream("./propertiesfile/demowebshop.properties");
		 prop=new Properties();
		 prop.load(fis);
		 //Excel file
		 FileInputStream fis1=new FileInputStream("./propertiesfile/TestScript data.xlsx");
		  workbook=WorkbookFactory.create(fis1);		 
	 }
	 @AfterTest
	 public void closeObject() throws IOException
	 {
		 workbook.close();
	 }
	 @Parameters("browser")
	@BeforeClass
	public void launch( String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		driver=new ChromeDriver();
		else if(browsername.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(browsername.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
@AfterClass
public void closeBroswer() {
	driver.quit();
}
}
