package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DependsOnMethods {
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	@Test
	public void register() throws InterruptedException
	{
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register is successsful",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(dependsOnMethods = "register")
	public void login() throws InterruptedException
	{

		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login is successful",true);
		Thread.sleep(2000);
		driver.quit();
	}
	
@Test(dependsOnMethods = {"register","login"})
public void addToCart() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/cart");
	Reporter.log("Product added to cart successful");
	Thread.sleep(2000);
	driver.quit();
}
}
