package testngselenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("target/LoginTestReport.html");

            spark.config().setReportName("Login Automation Test Report");
            spark.config().setDocumentTitle("TestNG + Selenium Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Application", "HerokuApp Login");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Tester", "Automation Tester");
        }
        return extent;
    }
}