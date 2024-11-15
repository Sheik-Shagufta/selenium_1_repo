package com.sdet.locators;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.time.LocalDateTime;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;

	public class Mock {
		public static void main(String[] args) throws IOException {
			String times = LocalDateTime.now().toString().replace(":", "-");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		 File dec = new File("./Screenshot/"+times+".png");
		 FileHandler.copy(tem, dec);
		 LocalDateTime time = LocalDateTime.now();
		 System.out.println(time);
	 
		 driver.findElement(By.linkText("Vtiger")).click();		 
		Set<String> windowid = driver.getWindowHandles();
		
		for(String id:windowid) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if(url.equals("https://www.vtiger.com/")) {
				break;
		}
		
			
		}
		 
		WebElement company = driver.findElement(By.xpath("(//a[@id='navbarLandings'])[17]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(company).perform();;
		
		driver.findElement(By.xpath("(//a[@href='/contact-us/'])[1]")).click();
		
		WebElement contact = driver.findElement(By.xpath("(//p[@class='mb-1'])[2]/..//p[@class='font-size-sm mb-0']"));
		System.out.println(contact.getText());
	}
	}


