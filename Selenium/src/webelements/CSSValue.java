package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(By.xpath("//div[contains(@class,'validation-summary-errors')]"));
		String color = msg.getCssValue("color");
		String weight = msg.getCssValue("font-weight");
		String fontfam = msg.getCssValue("font-family");
		System.out.println("The colour of error message is  "+ color);
		
		System.out.println("The font-weight of the error message is   " + weight);
		System.out.println("The font-family of the error message is   "+ fontfam);
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.linkText("Register"));
		String color1 = register.getCssValue("color");
		System.out.println(color1);
	}

}
