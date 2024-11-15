package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement selectoption = driver.findElement(By.id("cars"));
		Select opt=new Select(selectoption);
		Thread.sleep(2000);
		opt.selectByIndex(1);
		Thread.sleep(2000);
		opt.selectByIndex(0);
		Thread.sleep(2000);
		opt.selectByIndex(2);
		WebElement firstopt = opt.getFirstSelectedOption();
		System.out.println(firstopt.getText());
		List<WebElement> allopt = opt.getAllSelectedOptions();
		System.out.println("The size of selected options is  "+allopt.size());
		for(WebElement i:allopt)
		{			
			System.out.println(i.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
