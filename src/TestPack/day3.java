package TestPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
@BeforeClass
public void beeforclass()
{
	System.out.println("before executing any methods in class");
}

	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLogin(String urlname, String key)
	{
		//selenium 
		
		System.out.println("Web-based login");
		System.out.println(urlname);
		System.out.println(key);
	} 
	@Test
	public void mobLogin()
	{
		System.out.println("Mobile- Based Login");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I m no. 1");
	
	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I m before method");
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I m last number");
	}
	@Test
	public void mobSignInLogin()
	{
		System.out.println("Mobile- Based SignIn");
	}
	
	@Test(dataProvider = "getData")
	public void mobSignoutLogin(String username, String password)
	{
		System.out.println("Mobile- Based Signout");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"webLogin"})
	public void APICarLogin()
	{
		System.out.println("Rest API login");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st com= username n password - good credit histroy
		// 2nd username password - no credit history
		// 3rd -fraudelent 
		
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetUsername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondSetUsername";
		data[1][1] = "SecondPassword";
		
		data[2][0] = "ThirdSetUsername";
		data[2][1] = "ThirdPasword";
		return data;		
 	}
}
