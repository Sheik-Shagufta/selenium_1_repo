import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig8Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		  Thread.sleep(2000);		 
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		String a= driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
		Thread.sleep(2000);
		System.out.println("The discount of Samsung Galaxy is  " + a);
		Thread.sleep(2000);
		driver.close();
	}

}
