package Forkout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Archive {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("archive.html");
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
		WebElement a=driver.findElement(By.xpath("//div[@class='messenger-sidebar-users-section']"));
		Actions b=new Actions(driver);
		b.sendKeys(a, Keys.PAGE_DOWN).build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-name='sai']")).click();
		Thread.sleep(1000);
		//WebElement e=driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']"));
		//e.click();
		//e.sendKeys("/home/tvisha/ksnip_20211025-183032.png");
		driver.findElement(By.xpath("//input[@id='addAttachment']")).sendKeys("/home/tvisha/Pictures/airtime2.png");
	}
	/*@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(200);
		driver.switchTo().frame(0);
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/button")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/div/a[7]")).click();
		Thread.sleep(200);
		//view
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[6]/div/div[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[6]/div/div[2]/div/span")).click();
		Thread.sleep(500);
		//enter PWD
		driver.findElement(By.xpath("//*[@id=\"chatAccessPassword\"]")).sendKeys("123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='chatAccessEmployeeAutocomplete']")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//ul[@id='ui-id-63']")).click();
		Thread.sleep(1000);
		//e.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='chatAccessLogBtn']")).click();
	}*/

}
