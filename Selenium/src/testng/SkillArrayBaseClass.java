package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SkillArrayBaseClass {
WebDriver driver;
Properties prop;
@BeforeTest
public void fetchdata() throws IOException
{
	FileInputStream fis=new FileInputStream("./propertiesfile/skillarray.properties");
	prop=new Properties();
	prop.load(fis);
}
@Parameters("browser")
@BeforeClass
public void launchBrowser(String browsername) 
{
	if(browsername.equalsIgnoreCase("chrome"))
	driver=new ChromeDriver();
	else if(browsername.equalsIgnoreCase("edge"))
		driver=new EdgeDriver();
	else if(browsername.equalsIgnoreCase("firefox"))
		driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get(prop.getProperty("url"));
}
@BeforeMethod
public void login() 
{
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}
@AfterMethod
public void logout() 
{
	driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
	driver.findElement(By.linkText("Sign out")).click();
}
@AfterClass
public void closeBrowser() 
{
	driver.quit();
}
}
