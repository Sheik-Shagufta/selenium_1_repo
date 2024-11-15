import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandles {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	Thread.sleep(1000);
	driver.findElement(By.id("browserButton3")).click();
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
	for(String id:allID)
	{
		System.out.println(id);
	}
	driver.quit();*/
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Facebook")).click();
	Set<String> allID = driver.getWindowHandles();
	for(String id:allID)
	{
		System.out.println(id);
	}
	Thread.sleep(4000);
	driver.quit();
}
}
