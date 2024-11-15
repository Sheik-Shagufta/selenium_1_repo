package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assig1 {
	@Test(priority = 1,invocationCount = 2)
	public void createAccount() {
		Reporter.log("Executing from Create Account method", true);
	}
@Test(priority = 3)
public void deleteAccount() {
	Reporter.log("Executing from Delete Account method", true);
}
@Test(priority = 2,invocationCount = 3,threadPoolSize = 3)
public void editAccount()
{
	Reporter.log("Executing from Edit Account method", true);
}
}
