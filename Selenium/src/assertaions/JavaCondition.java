package assertaions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Hard Assert
public class JavaCondition {
@Test
public void login() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Welcome page is not displayed");
	Reporter.log("Welcome page is displayed",true);
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page is not displayed");
	Reporter.log("Login page is displayed",true);
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("abhis@1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
	Reporter.log("Home page is displayed",true);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log out")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
