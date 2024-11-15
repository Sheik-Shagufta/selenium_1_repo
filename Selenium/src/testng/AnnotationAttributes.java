package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	@Test(priority = 2,invocationCount = 2,threadPoolSize = 2)
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Reporter.log("Login is successful", true);
		Thread.sleep(2000);
		driver.quit();
	}
@Test(priority = 1,invocationCount = 3,threadPoolSize = 3,enabled = false)
public void register() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	Reporter.log("Register is successful", true);
	Thread.sleep(2000);
	driver.quit();
}
}
