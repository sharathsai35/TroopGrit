package units;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class unit {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("unit.html");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[4]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='unitNameInput']")).sendKeys("project4");
		driver.findElement(By.xpath("//input[@id='createUnitBtn']")).click();
		driver.findElement(By.xpath("//div[@data-search='Akhil']")).click();
		driver.findElement(By.xpath("//span[@class='admin-icon']")).click();
		driver.findElement(By.xpath("//div[@data-search='Other']")).click();
		driver.findElement(By.xpath("//span[@class='admin-icon']")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/div/div[3]/div[6]/input")).click();
		ExtentTest test=extent.createTest("create unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Select add button");
		test.info("Create unit name");
		test.info("click on create new");
		test.info("Select user");
		test.info("Select admin option");
		test.info("Click on save");
		test.info("EXPECTED RESULT ::  System should display unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Unit added successfully!");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[4]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='unitNameInput']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='createUnitBtn']")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/div/div[3]/div[6]/input")).click();
		ExtentTest test=extent.createTest("Create with same unitname");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on Units");
		test.info("click on create new");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should not create same unitname");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Unit name already exists!");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='delete-icon'])[1]")).click();
		ExtentTest test=extent.createTest("Delete the unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Select unit");
		test.info("Click on delete icon");
		test.info("EXPECTED RESULT ::  System should delete the unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Removed Unit!");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[6]/div/div[4]/div[1]/div[2]/div[1]/div[3]/span")).click();
		//driver.findElement(By.xpath("(//span[@class='delete-icon'])[2]")).click();	
		ExtentTest test=extent.createTest("Delete unit list");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("click on unit name");
		test.info("select user");
		test.info("Delete user in Unit list");
		test.info("EXPECTED RESULT ::  System should display unit list");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Removed Unit!");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]")).click();	
		driver.findElement(By.xpath("//*[@id=\"assignUserToUnitInput\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"assignUserToUnitInput\"]/option[4]")).click();
		driver.findElement(By.xpath("//div[@data-search='Akshay']")).click();
		driver.findElement(By.xpath("//div[@data-search='maneesh']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("//div[@data-id='7']")).click();
		ExtentTest test=extent.createTest("By adding user in assign");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on Units");
		test.info("click on Assign");
		test.info("click on To");
		test.info("Select unit name");
		test.info("Select user in From unit");
		test.info("Click on save");
		test.info("Goto units");
		test.info("EXPECTED RESULT ::  System should display users in unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Users Re-Assigned Successfully!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]")).click();	
		driver.findElement(By.xpath("//*[@id=\"assignUserToUnitInput\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"assignUserToUnitInput\"]/option[2]")).click();
		driver.findElement(By.xpath("//div[@data-search='Akshay']")).click();
		driver.findElement(By.xpath("(//span[@class='close-icon'])[1]")).click();
		//driver.findElement(By.xpath("(//span[@class='close-icon'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='btn save-btn']")).click();
		ExtentTest test=extent.createTest("Deleting users in Assign");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on Units");
		test.info("click on Assign");
		test.info("click on To");
		test.info("Select unit name");
		test.info("Delete the users in unitname");
		test.info("Click on save");
		test.info("Goto units");
		test.info("EXPECTED RESULT ::  System should not display users in unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Users Re-Assigned Successfully!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test7() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='unitsFilterSearchInput']")).sendKeys("mum");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='unitsFilterSearchInput']")).clear();
		driver.findElement(By.xpath("//input[@id='unitsFilterSearchInput']")).sendKeys("test");
		ExtentTest test=extent.createTest("Search unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Search unit name");
		test.info("EXPECTED RESULT ::  System should display unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying unit name");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test8() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/span")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//input[@id='masterUnitNameInput']")).sendKeys("north");
		driver.findElement(By.xpath("//input[@id='createMasterUnitBtn']")).click();
		driver.findElement(By.xpath("//div[@data-search='Test123']")).click();
		driver.findElement(By.xpath("//div[@data-search='test1234']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[5]/div/div[2]/div[3]/input")).click();
		ExtentTest test=extent.createTest("create master unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Click on master units");
		test.info("Click on add master unit");
		test.info("create master unit name");
		test.info("Add unit name");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  System should create master unit");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Unit added successfully!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test9() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/span")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//input[@id='masterUnitNameInput']")).sendKeys("fsgaf");
		driver.findElement(By.xpath("//input[@id='createMasterUnitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[5]/div/div[2]/div[3]/input")).click();
		ExtentTest test=extent.createTest("create master unit name without user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Click on master units");
		test.info("Click on add master unit");
		test.info("create master unit name");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  System should not create master unit");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  Unit added successfully!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void testcase10() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/span")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//input[@id='masterUnitNameInput']")).sendKeys("north");
		driver.findElement(By.xpath("//input[@id='createMasterUnitBtn']")).click();
		driver.findElement(By.xpath("//div[@data-search='Test123']")).click();
		driver.findElement(By.xpath("//div[@data-search='project']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[5]/div/div[2]/div[3]/input")).click();
		ExtentTest test=extent.createTest("create same master unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Click on master units");
		test.info("Click on add master unit");
		test.info("create master unit name");
		test.info("Add unit name");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  System should not create master unit");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Master Unit name already exists!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void testcase11() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/span")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[6]/span[2]")).click();
		ExtentTest test=extent.createTest("Delete master unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Click on master units");
		test.info("Click on delete master unit");
		test.info("EXPECTED RESULT ::  System should delete master unit");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Removed Master Unit!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void testcase12() throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/button")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[5]/div/div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='masterUnitsFilterSearchInput']")).sendKeys("north");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='masterUnitsFilterSearchInput']")).clear();
		driver.findElement(By.xpath("//input[@id='masterUnitsFilterSearchInput']")).sendKeys("test");
		ExtentTest test=extent.createTest("Search master unit name");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Advanced");
		test.info("Click on units");
		test.info("Search master unit name");
		test.info("EXPECTED RESULT ::  System should display master unit name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying master unit name");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	
	
	@AfterSuite
	public void endTest() {
		//extent.flush();
	}
}
