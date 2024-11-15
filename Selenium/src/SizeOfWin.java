import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfWin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.in");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height of the window is "+ size.getHeight());
		System.out.println("Width of the window is "+ size.getWidth());
	}

}
