import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		Point position = driver.manage().window().getPosition();
		System.out.println("X position of the web page is "+position.getX());
		System.out.println("Y position of the web page is "+position.getY());
		driver.quit();
	}

}
