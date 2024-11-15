package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	WebElement priceListBox = driver.findElement(By.id("cars"));
	Select multiopt=new Select(priceListBox);
	Thread.sleep(2000);
	multiopt.selectByIndex(0);
	Thread.sleep(2000);
	multiopt.selectByValue("299");
	Thread.sleep(2000);
	multiopt.selectByVisibleText("INR 50 - INR 99 ( 1 )");
	Thread.sleep(2000);
	multiopt.deselectAll();
	Thread.sleep(2000);
	driver.quit();
}
}
