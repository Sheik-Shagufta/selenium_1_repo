package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox//single select
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://upload.facebook.com/reg/");
		Thread.sleep(2000);
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select day=new Select(daydropdown);
		day.selectByIndex(5);
		Thread.sleep(2000);
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select month=new Select(monthdropdown);
		month.selectByValue("3");
		Thread.sleep(2000);
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select year=new Select(yeardropdown);
		year.selectByVisibleText("2002");
		Thread.sleep(2000);
		driver.quit();
	}

}
