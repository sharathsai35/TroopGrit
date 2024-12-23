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

public class lazyconnect {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("lazyconnect.html");
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("android");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='lazy-connect-container']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Click on lazy connect");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on lazy connect");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should click on lazy connect");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Lazy Connect");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Enable\n"
  				+ "Disable");
  		test.pass(a2);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is clicking on lazy connect");
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("android");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='lazy-connect-container']")).getText();
  		Thread.sleep(1000);
  		String a3=driver.findElement(By.xpath("//label[@for='permissionLazyConnectEnable']")).getText();
  		driver.findElement(By.xpath("//label[@for='permissionLazyConnectEnable']")).click();
  		Thread.sleep(1000);
  		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/input")).getAttribute("value");
  		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/input")).click();
  		Thread.sleep(1000);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Thread.sleep(1000);
  		driver.navigate().refresh();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
  		String a6=driver.findElement(By.xpath("//div[@class='search-user-btn']")).getText();
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Select enable & Click on add button in chat page");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on lazy connect");
  		test.info("Select enable");
  		test.info("Click on save button");
  		test.info("Click on refresh");
  		test.info("Click on add button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should display search user in add button");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Lazy Connect");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Enable\n"
  				+ "Disable");
  		test.pass(a2);
  		Assert.assertEquals(a3, "Enable");
  		test.pass(a3);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);
  		Assert.assertEquals(a6, "SEARCH USER");
  		test.pass(a6);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is displaying search user in add button");
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("android");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Lazy Connect']")).click();
  		Thread.sleep(1000);
  		String a2=driver.findElement(By.xpath("//div[@class='lazy-connect-container']")).getText();
  		Thread.sleep(1000);
  		String a3=driver.findElement(By.xpath("//label[@for='permissionLazyConnectDisable']")).getText();
  		driver.findElement(By.xpath("//label[@for='permissionLazyConnectDisable']")).click();
  		Thread.sleep(1000);
  		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/input")).getAttribute("value");
  		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/input")).click();
  		Thread.sleep(1000);
  		String a5=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
  		Thread.sleep(1000);
  		driver.navigate().refresh();
  		Thread.sleep(1000);
  		String a7=driver.findElement(By.xpath("//div[@class='add-btn']")).getAttribute("class");
  		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
  		String a6=driver.findElement(By.xpath("//div[@class='search-user-btn hidden']")).getAttribute("class");
  		Thread.sleep(1000);
  		ExtentTest test=extent.createTest("Select disable & Click on add button in chat page");
  		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL : http://192.168.2.55:8083");
		test.info("Enter username : sharath1");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on dashboard");
  		test.info("Click on controls");
  		test.info("Click on lazy connect");
  		test.info("Select disable");
  		test.info("Click on save button");
  		test.info("Click on refresh");
  		test.info("Click on add button");
  		test.log(Status.INFO, "EXPECTED RESULT ::  It should not display search user in add button");
  		Assert.assertEquals(a, "Controls");
  		test.pass(a);
  		Assert.assertEquals(a1, "Lazy Connect");
  		test.pass(a1);
  		Assert.assertEquals(a2, "Enable\n"
  				+ "Disable");
  		test.pass(a2);
  		Assert.assertEquals(a3, "Disable");
  		test.pass(a3);
  		Assert.assertEquals(a4, "SAVE");
  		test.pass(a4);
  		Assert.assertEquals(a5, "Updated!");
  		test.pass(a5);
  		Assert.assertEquals(a7, "add-btn");
  		test.pass(a7);
  		Assert.assertEquals(a6, "search-user-btn hidden");
  		test.pass(a6);
  		test.log(Status.PASS, "ACTUAL RESULT ::  It is not displaying search user in add button");
  		test.log(Status.PASS, "Test Case:: TestCase PASSED");
  		System.out.println(1);
  		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
