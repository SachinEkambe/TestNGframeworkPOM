package Extenantreport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenantReportEx {
 ExtentSparkReporter htmlReporter;//creating html file and it accepts file path as a parameter
 ExtentReports reports;//uses for creating tests
 ExtentTest test;//generating logs in the extent report
 @BeforeTest
 public void StartReport()
 {
	 htmlReporter=new ExtentSparkReporter("ExtenantReportDemo.html");
	 reports=new ExtentReports();
	 reports.attachReporter(htmlReporter);
	 
	 //Add environment Details
	 reports.setSystemInfo("Eclips", "Automation");
	 reports.setSystemInfo("user", "Sachin");
	 reports.setSystemInfo("Browser", "Chrome");
	 
	 try {
	 //configuration of change look and feel for htmlReporter (file configuration)
	 htmlReporter.config().getDocumentTitle();
	 htmlReporter.config().getReportName();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception found by sachin"+e);
	 }
	 htmlReporter.config().setTheme(Theme.DARK);
	 htmlReporter.config().setTimeStampFormat("EEEE, MMMM ,dd ,YYYY, hh:mm a '('zzz')'");
 }
@Test
 public void LunchBrowser()
 {
	test= reports.createTest("Lunch Browser");
	 Assert.assertTrue(true);
 }
@Test
 public void VarifyTitle()
 {
	test= reports.createTest("varify title");
	 Assert.assertTrue(false);
 }
@Test
 public void VarifyLogo()
 {
	 test=reports.createTest("varify logo");
	 throw new SkipException("skipped");
 }
@Test
 public void VarifyEmail()
 {
	test= reports.createTest("Varify email");
	 Assert.assertTrue(true);
 }
@AfterMethod
public void getTestResult(ITestResult result)
{
	
if(result.getStatus()==ITestResult.FAILURE)
{
test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail", ExtentColor.RED));	
}
else if
(result.getStatus()==ITestResult.SKIP)
{
test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"Skip", ExtentColor.YELLOW));	
}
else if
(result.getStatus()==ITestResult.SUCCESS)
{
test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Pass", ExtentColor.GREEN));	
}
}
@AfterTest
public void TearDown()
{
reports.flush();	
}
 
}
