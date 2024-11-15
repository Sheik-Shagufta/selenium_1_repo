import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
	}

}