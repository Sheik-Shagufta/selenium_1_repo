package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromXl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//Step 1:Create object for FileInputStream
		FileInputStream fis=new FileInputStream("./propertiesfile/TestScript data.xlsx");
		//Step 2:Create respective file object
		Workbook workbook=WorkbookFactory.create(fis);
		//Step 3:Call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("url : " + url);
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		/*OR 
		 Sheet sheet1 = workbook.getSheet("Sheet1");
		 String username = sheet1.getRow(1).getCell(1).getStringCellValue();*/
		System.out.println("Username : " + username);
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println("Password : " + password);
		String exprslt = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println("Expected result : " + exprslt);
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println("Price : " + price);
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println("Status : " + status);
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println("Date : " + date);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}

}
