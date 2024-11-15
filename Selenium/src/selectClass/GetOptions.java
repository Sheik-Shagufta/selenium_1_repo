package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement listboxopt = driver.findElement(By.id("cars"));
		Select allopt=new Select(listboxopt);
		List<WebElement> all = allopt.getOptions();
		System.out.println("The size of all the options is --->"+all.size());
		for(WebElement i:all)
		{
			System.out.println(i.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
