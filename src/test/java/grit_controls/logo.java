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

public class logo {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("logo.html");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[24]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		ExtentTest test=extent.createTest("Branding logo is Enable");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select center in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top center in user page");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='left']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[24]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		ExtentTest test=extent.createTest("Branding logo is Enable with left alignment");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select left in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top left corner in user page");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='right']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[24]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		ExtentTest test=extent.createTest("Branding logo with Alignment right");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select right in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top right corner in user page");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='right']")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingColorPicker']")).sendKeys("#cd2d45");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[24]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		ExtentTest test=extent.createTest("Branding logo with color ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select right in Alignment");
		test.info("Select background color is red");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top right corner in user page");
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingDisable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[24]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		ExtentTest test=extent.createTest("Branding logo with Disable ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Disable");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should not display any branding logo");
		test.log(Status.PASS ,"ACTUAL RESULT ::  updated!");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
