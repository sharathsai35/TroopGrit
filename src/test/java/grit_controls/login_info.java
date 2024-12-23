package grit_controls;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class login_info {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("login_info.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath1");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Login Info']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Login Info']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='login-info-control-wrapper']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on login info");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on login info");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should click on login info");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Login Info");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Login Screen Information");
  		test.pass(a2);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is clicking on login info");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println();
  		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath1");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Login Info']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Login Info']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='login-info-control-wrapper']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//textarea[@id='loginInfoTextInput']")).sendKeys("");
  		Thread.sleep(1000);
  		String a4=driver.findElement(By.xpath("//input[@id='loginInfoSaveBtn']")).getAttribute("value");
  		driver.findElement(By.xpath("//input[@id='loginInfoSaveBtn']")).click();
  		Thread.sleep(1000);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='9']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-value='Login Info']")).click();
  		Thread.sleep(1000);
  		String a3=driver.findElement(By.xpath("//textarea[@id='loginInfoTextInput']")).getAttribute("placeholder");
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Without entering any text click on save button");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on login info");
  		test.info("Don't enter any text in login info");
  		test.info("Click on save button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should save the login info");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Login Info");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Login Screen Information");
  		test.pass(a2);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);	
  		Assert.assertEquals(a3, "write information here..");
  		test.pass(a3);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is saving the login info");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println(1);
  		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath1");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Login Info']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Login Info']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='login-info-control-wrapper']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//textarea[@id='loginInfoTextInput']")).sendKeys("Test");
  		Thread.sleep(1000);
  		String a4=driver.findElement(By.xpath("//input[@id='loginInfoSaveBtn']")).getAttribute("value");
  		driver.findElement(By.xpath("//input[@id='loginInfoSaveBtn']")).click();
  		Thread.sleep(1000);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='9']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-value='Login Info']")).click();
  		Thread.sleep(1000);
  		String a3=driver.findElement(By.xpath("//textarea[@id='loginInfoTextInput']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Enter text information");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on login info");
  		test.info("Enter text : test");
  		test.info("Click on save button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should enter the text in login info");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Login Info");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Login Screen Information");
  		test.pass(a2);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);	
  		Assert.assertEquals(a3, "Test");
  		test.pass(a3);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is entering the text in login info");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println(2);
  		driver.close();
	}
	@AfterSuite
	public void endTest() { 
		extent.flush();
	}
}
