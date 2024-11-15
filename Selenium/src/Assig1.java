import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in");
	String title=driver.getTitle();
	if(title.equals("Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus"))
	{
		System.out.println("welcome page is displayed");
	}
	else {
		System.out.println("Welcome page is not displayed");
	}
	Dimension size = driver.manage().window().getSize();
	System.out.println("height of the web page is "+size.getHeight());
	System.out.println("width of the web page is "+size.getWidth());
	driver.close();
}
}
