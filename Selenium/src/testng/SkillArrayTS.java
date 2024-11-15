package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkillArrayTS extends SkillArrayBaseClass{
	@Test
	public void sales() 
	{
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle=prop.getProperty("title");
		if(actualTitle.equals(expectedTitle))
			Reporter.log("Sales page is displayed", true);
		else
			Reporter.log("Sales page is not displayed", true);
	}
}
