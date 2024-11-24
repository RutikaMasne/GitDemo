package TestPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
     @Parameters({"URL"})
	@Test
	public void webHomeLogin(String urlname)
	{
		//selenium 
		System.out.println("Web-based Home login");
		System.out.println(urlname);
	
	}
	@Test
	public void mobHomeLogin()
	{
		System.out.println("Mobile- Based Home Login");
	}
	
	@Test
	public void apiHomeLogin()
	{
		System.out.println("Rest API Home login");
		
	}
}
