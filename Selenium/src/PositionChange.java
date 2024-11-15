import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionChange {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/88");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		switchToWindow(driver,"ebay");
		Point ebaypos = driver.manage().window().getPosition();
		switchToWindow(driver,"flipkart");
		Point flipkartpos = driver.manage().window().getPosition();
		driver.manage().window().setPosition(ebaypos);
		switchToWindow(driver,"ebay");
		driver.manage().window().setPosition(flipkartpos);
		
		
		
	}
public static void switchToWindow(WebDriver driver,String url)
{
	Set<String> ids = driver.getWindowHandles();
	for(String i:ids)
	{
		driver.switchTo().window(i);
		String url1=driver.getCurrentUrl();
		if(url1.contains(url)) {
			break;
		}
	}
}

}
