package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderStorage {
@DataProvider
	public String[][] loginData()
	{
		String data[][]={{"admin","admin"},{"admin","admn"},{"admn","admin"},{"admn","admn"}};
		 return data;
		}
		
}
