package Forkout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class copy {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
	htmlReporter = new ExtentHtmlReporter("copy.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Global']")).click();
		WebElement w=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[10]/div/div/div[18]/div[5]/div"));
		Actions a=new Actions(driver);
		a.moveToElement(w).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[4]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"copyMessageSendBtn\"]")).click();
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		WebElement b=driver.findElement(By.xpath("//span[@class='message-input']"));
		b.sendKeys(Keys.CONTROL,"v");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		ExtentTest test = extent.createTest("Forward button for multiple users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("User:Select any user");
		test.info("Message:Select any message");
		test.info("Right click on message");
		test.info("Copy:Click on copy");
		test.info("Select any user");
		test.info("paste the copied msg");
		test.info("Click on send button");
		test.info("EXPECTED RESULT:: System should display the message to particular users");
		String actual=driver.findElement(By.xpath("//div[@data-name='sharath']")).getText();
		Assert.assertEquals(actual, "Sharath","hi");
		test.log(Status.PASS, actual);
		test.log(Status.PASS,"ACTUAL RESULT:: The message has displayed to particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
