package TestPack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void ploan() {
		System.out.println("Personal loan");
	}
	
	@BeforeTest
	public void preRequiste()
	{
		System.out.println("I will execute first");
	}
}