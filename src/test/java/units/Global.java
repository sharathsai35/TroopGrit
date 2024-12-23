package units;

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

public class Global {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Global.html");
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
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//input[@id='unitUsersSearchInput']")).sendKeys("sha");
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		driver.findElement(By.xpath("//div[@class='unit-user']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-default request-authorize-btn']")).click();
		driver.findElement(By.xpath("//div//textarea[@class='form-control reason-input-text']")).sendKeys("accept");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div/div[2]/div/div[2]/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("akshay");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//span[@class='accept-btn']")).click();
		//driver.findElement(By.xpath("//div[@data-type='home']")).click();
		ExtentTest test=extent.createTest("By Accepting the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("search user name");
		test.info("Click on apply");
		test.info("Select user");
		test.info("click on user");
		test.info("click on request authorization");
		test.info("send the response request");
		test.info("click on submit");
		test.info("Click on logout");
		test.info("login to akshay");
		test.info("Click on Global");
		test.info("Click on received");
		test.info("Click on Accept button");
		test.info("EXPECTED RESULT ::  System should display the name in chat page with global icon");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
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
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//input[@id='unitUsersSearchInput']")).sendKeys("hari");
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		driver.findElement(By.xpath("//div[@class='unit-user']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-default request-authorize-btn']")).click();
		driver.findElement(By.xpath("//div//textarea[@class='form-control reason-input-text']")).sendKeys("accept");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div/div[2]/div/div[2]/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hari");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//span[@class='reject-btn']")).click();
		//driver.findElement(By.xpath("//div[@data-type='home']")).click();
		ExtentTest test=extent.createTest("By Rejecting the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("search user name");
		test.info("Click on apply");
		test.info("Select user");
		test.info("click on user");
		test.info("click on request authorization");
		test.info("send the response request");
		test.info("click on submit");
		test.info("Click on logout");
		test.info("login to akshay");
		test.info("Click on Global");
		test.info("Click on received");
		test.info("Click on Reject button");
		test.info("EXPECTED RESULT ::  System should display the name in chat page with global icon");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//input[@id='unitUsersSearchInput']")).sendKeys("other");
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		driver.findElement(By.xpath("//div[@class='unit-user']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-default request-authorize-btn']")).click();
		driver.findElement(By.xpath("//div//textarea[@class='form-control reason-input-text']")).sendKeys("accept");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div/div[2]/div/div[2]/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//span[@class='cancel-btn']")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("other");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		//driver.findElement(By.xpath("//span[@class='reject-btn']")).click();
		//driver.findElement(By.xpath("//div[@data-type='home']")).click();
		ExtentTest test=extent.createTest("Cancel Request the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("search user name");
		test.info("Click on apply");
		test.info("Select user");
		test.info("click on user");
		test.info("click on request authorization");
		test.info("send the response request");
		test.info("click on submit");
		test.info("Click on cancel Request");
		test.info("Click on logout");
		test.info("login to maneesh");
		test.info("Click on Global");
		test.info("Click on received");
		test.info("EXPECTED RESULT ::  System should not display the user in global");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//input[@id='unitUsersSearchInput']")).sendKeys("uppi");
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		driver.findElement(By.xpath("//div[@class='unit-user']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-default request-authorize-btn']")).click();
		driver.findElement(By.xpath("//div//textarea[@class='form-control reason-input-text']")).sendKeys("accept");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default cancel-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("uppi");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Cancel the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("search user name");
		test.info("Click on apply");
		test.info("Select user");
		test.info("click on user");
		test.info("click on request authorization");
		test.info("send the response request");
		test.info("click on cancel");
		test.info("EXPECTED RESULT ::  System should not display the user in global");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div/div[3]/div[2]/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//span[@class='chat-btn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("By clicking on chat in global");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("Click on sent");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  System should display the particular chat page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displayed the particular chat page");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div/div[3]/div[2]/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//span[@class='revoke-btn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("By clicking on revoke in global");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("Click on sent");
		test.info("Click on Revoke");
		test.info("EXPECTED RESULT ::  System should not display the user in chat page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hari");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='global']")).click();
		driver.findElement(By.xpath("//span[@class='revoke-btn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("By clicking on revoke in global");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on Global");
		test.info("Click on Received");
		test.info("Click on Revoke");
		test.info("EXPECTED RESULT ::  User can send the Request again");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Successful");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
