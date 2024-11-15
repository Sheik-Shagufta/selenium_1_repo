package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assig1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.freshersworld.com/");
	String title = driver.getTitle();
	if(title.equals("Jobs: Search Jobs In India, Freshers Jobs Online, Govt Jobs, Recruitment | Freshersworld.com"))
		System.out.println("Register now is displayed");
	else
		System.out.println("Register now is not displayed");
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	WebElement citydropdown = driver.findElement(By.id("currentCity"));
	Select city=new Select(citydropdown);
	Thread.sleep(2000);
	city.selectByVisibleText("Bangalore");
	WebElement qualif = driver.findElement(By.id("course"));
		Select qual=new Select(qualif);
		Thread.sleep(2000);
		qual.selectByVisibleText("BE/B.Tech");
		Thread.sleep(3000);
		driver.quit();
	}

}
