import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("9002003004");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Instagram from Meta')]"));
		driver.close();
	}

}
