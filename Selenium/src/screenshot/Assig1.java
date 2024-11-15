package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assig1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			System.out.println("Flipkart application is displayed");
		else
			System.out.println("Flipkart application is not displayed");
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Thread.sleep(3000);
		e.sendKeys("mobiles");
		Thread.sleep(3000);
		e.sendKeys(Keys.ENTER);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+time+".png");
	FileHandler.copy(temp, dest);
	Thread.sleep(3000);
	driver.quit();
	}

}
