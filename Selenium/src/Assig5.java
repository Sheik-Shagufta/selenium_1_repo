import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String url = driver.getCurrentUrl();
				if(url.equals("https://demoapp.skillrary.com/login.php?type=register"))
				{
					System.out.println("Register page is displayed");
					driver.findElement(By.name("firstname")).sendKeys("sheik");
					driver.findElement(By.name("lastname")).sendKeys("shagufta");
					driver.findElement(By.name("email")).sendKeys("sheikshagufta6302@gmail.com");
					driver.findElement(By.name("password")).sendKeys("Sh@123");
					driver.findElement(By.name("repassword")).sendKeys("Sh@123");
					driver.findElement(By.name("signup")).click();
					driver.navigate().back();
					if(url.equals("https://demoapp.skillrary.com/login.php?type=register"))
					System.out.println("Hme [age is diplayed");
				}
				else {
					System.out.println("Register page is not displayed");
				}
				
	}

}
