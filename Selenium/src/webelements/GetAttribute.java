package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		String value = searchTF.getAttribute("placeholder");
		System.out.println(value);
		driver.close();
	}

}
