import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sheikshagufta6302@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		if(url.equals("https://demowebshop.tricentis.com/"))
		{
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
