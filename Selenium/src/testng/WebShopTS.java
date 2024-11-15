package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WebShopTS extends WebShopBaseClass {
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.linkText("Books")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = workbook.getSheet("Books").getRow(1).getCell(0).getStringCellValue();
		if(actualTitle.equals(expectedTitle))
			Reporter.log("Books page is displayed", true);
		else
			Reporter.log("Books page is not displayed", true);
	}

}
