package grit_controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Searchfieldincontrols {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("searchfieldincontrols.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='permissionFeaturesSearch']")).click();
		String a=driver.findElement(By.xpath("//input[@id='permissionFeaturesSearch']")).getAttribute("placeholder");
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Click on search field in controls");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath1");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on controls");
		test.info("Click on search");
		test.info("EXPECTED RESULT:: It should click on search in controls page");
		Assert.assertEquals(a, "Search");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking on search in controls page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='permissionFeaturesSearch']")).click();
		String a=driver.findElement(By.xpath("//input[@id='permissionFeaturesSearch']")).getAttribute("placeholder");
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Click on search field in controls");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath1");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on controls");
		test.info("Click on orange member");
		test.info("EXPECTED RESULT:: It should display orange member page");
		Assert.assertEquals(a, "Search");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying orange member page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
