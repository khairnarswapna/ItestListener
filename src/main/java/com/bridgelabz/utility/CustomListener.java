
package com.bridgelabz.utility;
import com.bridgelabz.base.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;


public class CustomListener extends BaseClass implements ITestListener
{
	public void onTestStart(ITestResult result)
	{

	}

	public void onTestSuccess(ITestResult result)
	{

	}

	public void onTestFailure(ITestResult result)
	{
		try {
			Utility.captureScreenShot();

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result)
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}
	public void onFinish(ITestContext context)
	{

	}
}
