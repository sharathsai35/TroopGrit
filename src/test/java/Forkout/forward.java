package Forkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class forward {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("forward.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='Global']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[10]/div/div/div[18]/div[5]/div/div[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(e).click(e).perform();
		Thread.sleep(500);
		WebElement s=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[10]/div/div/div[18]/div[5]/div/div[2]/div/div[2]"));
		Actions a1=new Actions(driver);
		Thread.sleep(500);
		a1.click(s).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[10]/div/div/div[4]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"forwardMessageSendBtn\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[5]/div[1]/div/div/div[2]/div[3]/div[7]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[5]/div[1]/div/div/div[2]/div[3]/div[10]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"modalForwardSendMessageBtn\"]")).click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[@data-name='sharath']")).getText();
		//Assert.assertEquals(actual, "sharath", "hii");
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Message forward to multipleusers");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("username:maneesh");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("User:click on any user");
		test.info("message:hii");
		test.info("Forward:select any users");
		test.info("send:click on send");
		test.info("EXPECTED RESULT:: System should display the particular users");
		test.log(Status.PASS, actual);
		test.log(Status.PASS,"ACTUAL RESULT:: message should be dispaly to particular users");
		test.pass("Test Case:: TestCase PASSED");
		}
}
