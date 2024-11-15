package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		user.clear();
		Thread.sleep(2000);
		user.sendKeys("testing");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys("123456");
		Thread.sleep(2000);
		driver.close();		
	}
}
