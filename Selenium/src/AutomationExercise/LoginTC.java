package AutomationExercise;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTC {
	@Test
	public void ligin()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://automationexercise.com");
		//assert.assertEquals(driver.getTitle().isDisplayed(), true, "Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		driver.findElement(By.linkText(" Signup / Login")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sheik");
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("sheikshagufta6302@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		
	}

}
