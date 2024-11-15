package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataReceivingFromAC {
	@Test(dataProviderClass = DataProviderStorage.class,dataProvider = "loginData")
	public void login(String cred[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce", "Login failed");
		Reporter.log("Login successful");
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}

}
