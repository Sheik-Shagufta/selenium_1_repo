import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 String title = driver.getTitle();
		 if(title.equals("Demo Web Shop"))
		 {
			 System.out.println("Welcome page is displayed");
		 }
		 else
		 {
			 System.out.println("Welcome page is not displayed");
		 }
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.findElement(By.id("Twitter")).click();
		 Set<String> id = driver.getWindowHandles();
		 for(String i:id)
		 {
			 System.out.println(i);
		 }
		 
		
	}

}
