//package resources;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//
//public class ExtentReportsClass {
//
//	static ExtentReports extentReports;
//
//	public static ExtentReports getReportObject() {
//		String path = System.getProperty("user.dir") + "reports/index.html";
//		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
//		extentSparkReporter.config().setReportName("Web Automation Results");
//		extentSparkReporter.config().setDocumentTitle("Test Results");
//
//		extentReports = new ExtentReports();
//		extentReports.attachReporter(extentSparkReporter);
//		extentReports.setSystemInfo("Tester", "RKP");
//
//		return extentReports;
//	}
//}
