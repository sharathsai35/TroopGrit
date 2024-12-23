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

public class Applanguages {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("applanguage.html");
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
  		String a1=driver.findElement(By.xpath("//div[@data-value='App Language']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='App Language']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='app-language-control-wrapper']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on app language");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on app language");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should click on app language");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "App Language");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Default Language\n"
  				+ "English\n"
  				+ "한국어");
  		test.pass(a2);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is clicking on app language");
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
  		String a1=driver.findElement(By.xpath("//div[@data-value='App Language']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='App Language']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='app-language-control-wrapper']")).getText();
  		driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).click();
  		String a3=driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).click();
  		String a4=driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).getAttribute("value");
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on radio button of english");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on app language");
  		test.info("Select the radio button english");
  		test.info("Click on save button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should click on radio button of english");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "App Language");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Default Language\n"
  				+ "English\n"
  				+ "한국어");
  		test.pass(a2);
  		Assert.assertEquals(a3, "English");
  		test.pass(a3);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is clicking on radio button of english");
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
  		String a1=driver.findElement(By.xpath("//div[@data-value='App Language']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='App Language']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='app-language-control-wrapper']")).getText();
  		driver.findElement(By.xpath("//label[@for='permissionAppLanguageKo']")).click();
  		String a3=driver.findElement(By.xpath("//label[@for='permissionAppLanguageKo']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).click();
  		String a4=driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).getAttribute("value");
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on radio button of english");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on app language");
  		test.info("Select the radio button korean");
  		test.info("Click on save button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should click on radio button of korean");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "App Language");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Default Language\n"
  				+ "English\n"
  				+ "한국어");
  		test.pass(a2);
  		Assert.assertEquals(a3, "한국어");
  		test.pass(a3);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is clicking on radio button of korean");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println(2);
  		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
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
  		String a1=driver.findElement(By.xpath("//div[@data-value='App Language']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='App Language']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='app-language-control-wrapper']")).getText();
  		driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).click();
  		String a3=driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).click();
  		String a4=driver.findElement(By.xpath("//input[@id='appLanguageSaveBtn']")).getAttribute("value");
  		Thread.sleep(1000);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='9']")).click();
  		String a8=driver.findElement(By.xpath("//div[@data-tab='9']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a6=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-value='App Language']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).click();
  		String a9=driver.findElement(By.xpath("//label[@for='permissionAppLanguageEn']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on english & save & Go back & Again click on app language");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on app language");
  		test.info("Select the radio button english");
  		test.info("Click on save button");
  		test.info("Click on another tab");
  		test.info("Again Click on app language");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should not change the app language radio button");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "App Language");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Default Language\n"
  				+ "English\n"
  				+ "한국어");
  		test.pass(a2);
  		Assert.assertEquals(a3, "English");
  		test.pass(a3);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);
  		Assert.assertEquals(a8, "Groups");
  		test.pass(a8);
  		Assert.assertEquals(a6, "Controls");
  		test.pass(a6);
  		Assert.assertEquals(a9, "English");
  		test.pass(a9);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is not changing the app language radio button");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println(3);
  		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
