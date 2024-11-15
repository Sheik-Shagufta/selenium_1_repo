package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assig2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://upload.facebook.com/reg/");
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select monthselect=new Select(monthdropdown);
		List<WebElement> allopt = monthselect.getOptions();
		int size = allopt.size();
		for(int i=0;i<size; i++ )
		{
			Thread.sleep(1000);
			monthselect.selectByIndex(i);
			WebElement text = allopt.get(i);
			System.out.println(text.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
