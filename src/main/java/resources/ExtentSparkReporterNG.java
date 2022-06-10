package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentSparkReporterNG {

	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	public static ExtentReports getReportObject() {
		
		String file = System.getProperty("user.dir")+"/report/index.html";
		
		reporter = new ExtentSparkReporter(file);
		
		reporter.config().setDocumentTitle("Test Result");
		
		reporter.config().setReportName("Web Results");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Software Test Engineer","Viraj D. Utekar");
		
		return extent;
	}
	
}
