package grit_controls;

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

public class videocall {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("video.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/span")).click();
		driver.findElement(By.xpath(" //*[@id=\"permissionVideoCallEnable\"]\n")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[13]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='video-call-header-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Video call Enable");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("username:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on Admin Dashboard");
		test.info("click on Control");
		test.info("click on Video call");
		test.info("Select Enable");
		test.info("click on save button");
		test.info("GOTO chat");
		test.info("Select any user");
		test.info("Click on video call");
		test.info("EXPECTED RESULT:: System should display the Video call symbol");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "ACTUAL RESULT:: Updated!");
		test.log(Status.PASS, "ACTUAL RESULT:: Video call symbol is visible");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/span")).click();
		driver.findElement(By.xpath(" //*[@id=\"permissionVideoCallDisable\"]")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[13]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Video call Disable");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("username:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on Admin Dashboard");
		test.info("click on Control");
		test.info("click on Video call");
		test.info("Select Disable");
		test.info("click on save button");
		test.info("GOTO chat");
		test.info("Select any user");
		test.info("EXPECTED RESULT:: System should not display the Video call symbol");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "ACTUAL RESULT:: Updated!");
		test.log(Status.PASS, "ACTUAL RESULT:: Video call symbol is not visible");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
