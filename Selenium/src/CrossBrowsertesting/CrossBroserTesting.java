package CrossBrowsertesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBroserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launch(@Optional("edge") String browsername) throws InterruptedException
	{
		if(browsername.equals("chrome"))
			driver=new ChromeDriver();
		else if(browsername.equals("edge"))
			driver=new EdgeDriver();
		else if(browsername.equals("firefox"))
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
