package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImpFromBC.class)
public class ListenerTestscript  extends ListenerBaseClass{
	@Test
	public void login()
	{
		Reporter.log("click on login link",true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("enter valid credintials",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		Reporter.log("click on login button",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Verify home page displayed or not",true);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
	}

}
