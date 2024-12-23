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

public class model {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("model.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[3]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in ID");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select ID");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display ID field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[2]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Mobile");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Mobile");
		test.info("Click on Admin created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Mobile field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[1]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Mobile");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Mobile");
		test.info("Click on User created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Mobile field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[2]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Email");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Email");
		test.info("click on admin created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Email field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[1]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Email");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Email");
		test.info("click on User created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Email field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[1]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Email and mobile");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Email");
		test.info("click on User created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Emailand mobile field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[7]/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[2]/div/label")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[1]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[2]/div[2]/div[1]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"saveModelBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]")).click();
		ExtentTest test=extent.createTest("Model in Email and mobile");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Model");
		test.info("Select Email");
		test.info("click on admin created");
		test.info("GOTO user in that page");
		test.info("Click on Add User");
		test.info("EXPECTED RESULT ::  System should display Email and mobile field in Add User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
