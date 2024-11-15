import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QspiSDET/Selenium/Table.html");
		String a = driver.findElement(By.xpath("//td[text()='K.G.F']/following-sibling::td[1]")).getText();
		String b = driver.findElement(By.xpath("//td[text()='K.G.F']/following-sibling::td[2]")).getText();
		Thread.sleep(3000);
		driver.close();
		System.out.println("The collection of KGF is ---> " + a);
		System.out.println("The Imdb rating of KGF is ---> " + b);
		
		
	}

}
