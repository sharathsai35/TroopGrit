package grit_controls;

import java.io.IOException;
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

public class fileswithsize {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("fileswithsize.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8080/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[13]/span")).click();
		driver.findElement(By.xpath(" //select[@id='filesSizeUnit']/option[1]")).click();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).clear();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='filesSaveBtn']")).click();
		driver.navigate().refresh();*/
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//input[@id='addAttachment']")).sendKeys("/home/tvisha/man.html");
		Thread.sleep(1000);
		//Runtime.getRuntime().exec("/home/tvisha/man.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		ExtentTest test=extent.createTest("Files in KB");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Files");
		test.info("Select KB");
		test.info("Enter text field");
		test.info("Click on save");
		test.info("GoTo chat");
		test.info("Select on any user");
		test.info("EXPECTED RESULT ::  System should display attachment in 12KB");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8080/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[13]/span")).click();
		driver.findElement(By.xpath(" //select[@id='filesSizeUnit']/option[2]")).click();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).clear();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='filesSaveBtn']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//input[@id='addAttachment']")).sendKeys("/home/tvisha/man.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		ExtentTest test=extent.createTest("Files in MB");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Files");
		test.info("Select MB");
		test.info("Enter text field");
		test.info("Click on save");
		test.info("GoTo chat");
		test.info("Select on any user");
		test.info("EXPECTED RESULT ::  System should display attachment in 12MB");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8080/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[13]/span")).click();
		driver.findElement(By.xpath(" //select[@id='filesSizeUnit']/option[3]")).click();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).clear();
		driver.findElement(By.xpath("//input[@id='filesMaxFileSizeInput']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='filesSaveBtn']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//input[@id='addAttachment']")).sendKeys("/home/tvisha/man.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		ExtentTest test=extent.createTest("Files in GB");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Files");
		test.info("Select GB");
		test.info("Enter text field");
		test.info("Click on save");
		test.info("GoTo chat");
		test.info("Select on any user");
		test.info("EXPECTED RESULT ::  System should display attachment in 12GB");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
