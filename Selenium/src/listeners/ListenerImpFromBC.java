package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class ListenerImpFromBC extends ListenerBaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+timestamp+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Login success",true);
	}

}
