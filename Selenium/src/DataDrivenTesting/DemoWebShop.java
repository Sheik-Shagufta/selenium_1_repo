package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./propertiesfile/demowebshop.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String pass = prop.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		//Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
