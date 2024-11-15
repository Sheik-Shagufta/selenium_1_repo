package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementSS {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		File temp = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+time+"insta.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(3000);
		driver.close();
	}

}
