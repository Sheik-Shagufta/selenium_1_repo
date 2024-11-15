import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		if(url.contains("demowebshop"))
			System.out.println("Home is displayed");
		else
			System.out.println("Home page is not displayed");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		reuse(driver,"Facebook");
		String furl = driver.getCurrentUrl();
		if(furl.equals("https://www.facebook.com/nopCommerce"))
			System.out.println("Facebook home page is displayed");
		else
			System.out.println("Facebook home page is not displayed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(3000);
		reuse(driver,"Facebook");
		String surl = driver.getCurrentUrl();
		if(surl.equals("https://www.facebook.com/reg/?next=%2FnopCommerce"))
			System.out.println("Sing up page is displayed");
		else
			System.out.println("Sing up page is displayed");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sheik Shagufta");
		Thread.sleep(4000);
		driver.quit();
	}
public static void reuse(WebDriver driver,String url)
{
	Set<String> id = driver.getWindowHandles();
	for(String i:id)
	{
		driver.switchTo().window(i);
		String url1 = driver.getCurrentUrl();
		if(url1.contains(url))
			break;		
	}
}
}
