package qsp;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportingTool1 {
	@Test
	public void test1()
	{
		//step1
		ExtentReports report=new ExtentReports("./reports/r.html",false);
		//step2
		ExtentTest log1 = report.startTest("tc1");
		//step3
		log1.log(LogStatus.PASS,"tc passed");
		log1.log(LogStatus.FAIL,"tc failed");
		log1.log(LogStatus.SKIP,"tc skipped");
		//step4
		report.endTest(log1);
		//step5
		report.flush();
	}
	

}
