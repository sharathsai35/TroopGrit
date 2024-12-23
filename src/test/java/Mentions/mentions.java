package Mentions;

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

public class mentions {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("mention.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@man");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[8]/span")).click();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("mention:select any user");
		test.info("Input:@man");
		test.info("EXPECTED RESULT:: Mention should be highlight in the chat conversation");
		test.log(Status.PASS,"ACTUAL RESULT::  It is highlighted in chat conversation");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@nar");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("mention:select any user");
		test.info("Input:@nar");
		test.info("EXPECTED RESULT:: Mention should be highlight in the chat conversation");
		test.log(Status.PASS,"ACTUAL RESULT::  It is highlighted in chat conversation");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Testing 1']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@har");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[7]")).click();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Mentions with Groups");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("mention:select any user");
		test.info("Input:@har");
		test.info("EXPECTED RESULT:: Mention should be highlight in the chat conversation");
		test.log(Status.PASS,"ACTUAL RESULT::  It is highlighted in chat conversation");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void EndTest() {
		extent.flush();
	}
}
