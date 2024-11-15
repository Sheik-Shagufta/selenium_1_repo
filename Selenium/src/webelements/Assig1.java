package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String title = driver.getTitle();
		if(title.equals("vtiger"))
			System.out.println("Welcome page is displayed");
		else
			System.out.println("Welcome page is not displayed");
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Testing");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(4000);
		driver.close();
	}

}
