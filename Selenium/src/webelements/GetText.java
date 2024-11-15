package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String msg = driver.getTitle();
		System.out.println(msg);
		if(msg.contains("Login was unsuccessful"))
			System.out.println("Error message is displayed");
		else
			System.out.println("Error message is not displayed or incorrect");
		Thread.sleep(3000);
		driver.close();
	}
	

}
