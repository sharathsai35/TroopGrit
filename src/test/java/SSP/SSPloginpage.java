package SSP;

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

public class SSPloginpage {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("LoginSSP.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:7000");
		driver.manage().window().maximize();
	}
	@Test
	public void test00() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on login without entering email & password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : empty");
		test.info("Password: empty");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Username is required.");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("sharath@test6.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter only email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@test6.com");
		test.info("Password: empty");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Password is required.");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter password & Don't enter email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : empty");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Username is required.");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("sharath@asd.com");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter password & enter wrong email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@sad.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Invalid Credentials");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("sharath@test6.com");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("saddsa");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter wrong password & enter email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@test6.com");
		test.info("Password: asdasd");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Invalid Credentials");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("sharath@asd.com");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("asddasd");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter wrong password & email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@sad.com");
		test.info("Password: asdasd");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "Invalid Credentials");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException {
		start();
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("sharath@test6.com");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='pull-left']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter password & email & Click on login");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@test6.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("EXPECTED RESULT:: It should display dashboard page");
		Assert.assertEquals(a, "License\n"
				+ "Downloads\n"
				+ "Wiki");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying dashboard page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
