package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement goodradiobutton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		Thread.sleep(2000);
		System.out.println("------Before clicking------");
		System.out.println(goodradiobutton.isSelected());
		Thread.sleep(2000);
		goodradiobutton.click();
		System.out.println("------After clicking------");
		System.out.println(goodradiobutton.isSelected());
	}

}
