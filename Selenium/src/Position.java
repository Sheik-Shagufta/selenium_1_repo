import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		Point position = driver.manage().window().getPosition();
		driver.manage().window().setSize(new Dimension(100,500));
		System.out.println("X position of the web page is "+position.getX());
		System.out.println("Y position of the web page is "+position.getY());
		driver.close();
	}

}
