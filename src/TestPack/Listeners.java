package TestPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interfac which implements Testng listners
public class Listeners implements ITestListener {


		    public void onTestStart(ITestResult result) {
		    	System.out.println("Successfully Passed Listener");
		    	
		    }

		    public void onTestSuccess(ITestResult result) {
		    	
		    }

		    public void onTestFailure(ITestResult result) {
		        System.out.println("I failed executed Listeners Pass code" + result.getName());
		    }

		    public void onTestSkipped(ITestResult result) {
		    }

		    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    }

		    public void onStart(ITestContext context) {
		    }

		    public void onFinish(ITestContext context) {
		    }

	}

