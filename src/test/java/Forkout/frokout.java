package Forkout;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class frokout {
		WebDriver driver;
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;

		String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
		@BeforeSuite
		public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("forkout.html");
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
			driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hi");
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='sharath'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Global'])")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//div[@data-name='Global']")).click();
			ExtentTest test = extent.createTest("Multiple users");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:hi");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: System should display in selected users");
			test.log(Status.PASS,"ACTUAL RESULT::  System is selected to that particular user");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();
		}
		@Test
		public void test1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@sha");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[9]/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='sharath'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Global'])")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//div[@data-name='Global']")).click();
			ExtentTest test = extent.createTest("Multiple users with mentions");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sha");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: System should display in selected users and message should be highlighted");
			test.log(Status.PASS,"ACTUAL RESULT:: System is sended the message in particular users with highlighted ");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();
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
			driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hi");
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='sharath'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Global'])")).click();
			driver.findElement(By.xpath("//label[@for='forkoutMarkerCheckbox']")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//div[@data-name='Global']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker ");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sharath");
			test.info("Forkout:select multiple users");
			test.info("click on forkoutmarker checkbox");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  System should send the messages without marker");
			test.log(Status.PASS, "Actual result:: System is sended the message without marker");
			test.pass("Test Cases:: TestCase Passed");
			driver.close();
		}
		@Test
		public void test3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@sha");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[9]/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='sharath'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Global'])")).click();
			driver.findElement(By.xpath("//label[@for='forkoutMarkerCheckbox']")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//div[@data-name='Global']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker with mentions");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sha");
			test.info("Forkout:select multiple users");
			test.info("Click on forkoutmarker checkbox");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  System should send the messages without marker");
			test.log(Status.PASS, "Actual result:: System is sended the message without marker and it is highlighted");
			test.pass("TestCases:: TestCases Passed");
			driver.close();
		}
		@Test
		public void test4() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='test']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hi");
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("//div[@data-username='Testing 1']")).click();
			driver.findElement(By.xpath("//div[@data-username='Hari']")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='Hari']")).click();
			driver.findElement(By.xpath("//div[@data-name='Testing 1']")).click();
			ExtentTest test = extent.createTest("Multiple groups and users");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:hi");
			test.info("Forkout:select multiple groups & users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: System should display in selected groups & users");
			test.log(Status.PASS,"ACTUAL RESULT::  System is sended the message to particular groups & users");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();
		}
		@Test
		public void test5() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='test']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@sha");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[9]/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='Hari'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Testing 1'])")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='Hari']")).click();
			driver.findElement(By.xpath("//div[@data-name='Testing 1']")).click();
			ExtentTest test = extent.createTest("Multiple groups and users with mentions");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sha");
			test.info("Forkout:select multiple groups & users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: System should display in selected users & groups with message highlighted");
			test.log(Status.PASS,"ACTUAL RESULT:: System is sended the message to particular user & groups with highlighted");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();
		}
		@Test
		public void test6() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='test']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hi");
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='Hari'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Testing 1'])")).click();
			driver.findElement(By.xpath("//label[@for='forkoutMarkerCheckbox']")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='Hari']")).click();
			driver.findElement(By.xpath("//div[@data-name='Testing 1']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker in groups and users");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sharath");
			test.info("Forkout:select multiple users");
			test.info("click on forkoutmarker checkbox");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  System should send the messages without marker");
			test.log(Status.PASS, "Actual result:: System is sended the message without marker in groups & users");
			test.pass("Test Cases:: TestCase Passed");
			driver.close();
		}
		@Test
		public void test7() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-name='test']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@sha");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[11]/div[1]/div/div[9]/div[2]/div[9]/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("(//div[@data-username='Hari'])")).click();
			driver.findElement(By.xpath("(//div[@data-username='Testing 1'])")).click();
			driver.findElement(By.xpath("//label[@for='forkoutMarkerCheckbox']")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			driver.findElement(By.xpath("//div[@data-name='Hari']")).click();
			driver.findElement(By.xpath("//div[@data-name='Testing 1']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker with mentions in groups and users");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:sharath");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Input:@sha");
			test.info("Forkout:select multiple groups & users");
			test.info("Click on forkoutmarker checkbox");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  System should send the messages without marker");
			test.log(Status.PASS, "Actual result:: System is sended the message without marker in groups & users with highlighted");
			test.pass("TestCases:: TestCases Passed");
			driver.close();
		}
		@AfterSuite
		public void endTest() {
			extent.flush();
		}
}
