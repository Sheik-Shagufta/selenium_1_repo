package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement optionlist = driver.findElement(By.id("cars"));
		Select opt=new Select(optionlist);
		boolean multiselect = opt.isMultiple();
		if(multiselect==true)
			System.out.println("The option listbox is multi select");
		else
			System.out.println("The option listbox is not multi select");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		WebElement yearselect = driver.findElement(By.id("year"));
		Select year=new Select(yearselect);
		boolean multiyearselect = year.isMultiple();
		if(multiyearselect==true)
			System.out.println("Year dropdown is multi select");
		else
			System.out.println("Year dropdown is multi select");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
