package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchData {
	public static void main(String[] args) throws IOException, InterruptedException {
		//step-1: Create object forFileInputstream
		FileInputStream fis=new FileInputStream("./propertiesfile/demoapp.properties");
		//step-2: Create respective type file object
		Properties prop=new Properties();
		//step-3: call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String pass = prop.getProperty("password");
		/*System.out.println("url : " +url);
		System.out.println("username : " +username);
		System.out.println("password : " +pass);*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(2000);
		System.out.println("url : " +url);
		System.out.println("username : " +username);
		System.out.println("password : " +pass);
		Thread.sleep(4000);
		driver.quit();
	}

}
