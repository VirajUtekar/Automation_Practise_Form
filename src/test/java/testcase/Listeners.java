package testcase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentSparkReporterNG;

public class Listeners extends Base implements ITestListener {

	public ExtentReports extent = ExtentSparkReporterNG.getReportObject();
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    test.log(Status.PASS,"Test Case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    test.fail(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
	   extent.flush();
	}

}
