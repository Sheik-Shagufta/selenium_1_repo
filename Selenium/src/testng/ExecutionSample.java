package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutionSample {
	@Test
	public void sample()
	{
		Reporter.log("Sample testcase Ececutaion", true);
	}
@Test
public void add()
{
	Reporter.log("Add testcase execution", true);
}
@Test
public void demo()
{
	Reporter.log("Demo testcase execution", true);
}
}
