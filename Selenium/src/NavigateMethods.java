
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://github.com");
	//driver.navigate().to("https://github.com"); or
	driver.navigate().to(new URL("https://github.com"));
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();//for reload and refresh same method
	
	
	
}
}
