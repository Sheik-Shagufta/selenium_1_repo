import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/88");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String i:ids)
		{
			driver.switchTo().window(i);
			String url = driver.getCurrentUrl();
			System.out.println(url);
				Point p = driver.manage().window().getPosition();
				System.out.println(p);			
		if(url.contains("ebay"))
			driver.manage().window().setPosition(new Point(10,250));
		else if(url.contains("flipkart"))
			driver.manage().window().setPosition(new Point(800,250));
		
		}
		Thread.sleep(35000);
		driver.quit();
	}

}
