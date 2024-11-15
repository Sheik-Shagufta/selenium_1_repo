import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig9Shopper {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/88");
		Thread.sleep(15000);
		String pid = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Thread.sleep(5000);
		Set<String> id = driver.getWindowHandles();
		Thread.sleep(5000);
		for(String i:id) {
			driver.switchTo().window(i);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart"))
			{
				break;			
		}	
		}
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("mobiles");
						System.out.println(size);
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(pid);
						driver.findElement(By.id("loginBtn")).click();
	}
                                                                                                                                                                   }



