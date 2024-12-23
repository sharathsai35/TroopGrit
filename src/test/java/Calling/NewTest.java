package Calling;

import org.testng.annotations.Test;

import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest {
	WebDriver driver;
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
	}
	public void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/tvisha/Documents/driver/geckodriver-v0.30.0-linux64/geckodriver");
		driver=new FirefoxDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("maneesh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void call() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).click();
		Thread.sleep(2000); 
		
	
		DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
		// Set the pre defined capability – ACCEPT_SSL_CERTS value to true
		SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		// Open a new instance of chrome driver with the desired capability
		driver = new ChromeDriver(SSLCertificate);
		
		 ChromeOptions theOptions = new ChromeOptions().setHeadless(true);
		  theOptions.addArguments("chrome://flags");
		  theOptions.addArguments("unsafely-treat-insecure-origin-as-secure_name");
		  theOptions.addArguments("--enable-experimental-wasm-eh");
		   LoggingPreferences theLoggingPreferences = new LoggingPreferences();
		  theLoggingPreferences.enable(LogType.BROWSER, Level.ALL);
		  theOptions.setCapability(CapabilityType.LOGGING_PREFS, theLoggingPreferences);
		   DesiredCapabilities theCapabilities = DesiredCapabilities.chrome();
		  theCapabilities.setCapability(ChromeOptions.CAPABILITY, theOptions);
		
		  ChromeOptions opt=new ChromeOptions();
		  opt.setExperimentalOption("http://192.168.2.55:8083", "");
		 

		//Thread.sleep(5000); 
		//Thread.sleep(5000);

		
		
	}
	@Test
	public void calluser2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("chrome://flags");
		driver.findElement(By.id("search")).sendKeys("insecure origin");
		driver.findElement(By.xpath("//div[@id='unsafely-treat-insecure-origin-as-secure']")).click(); 
		WebElement e=driver.findElement(By.xpath("//textarea[@aria-labelledby='unsafely-treat-insecure-origin-as-secure_name']")); e.click(); 
		e.sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.xpath("//select[@aria-labelledby='unsafely-treat-insecure-origin-as-secure_name']")).click();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Thread.sleep(2000);
		Thread.sleep(5000);
		driver.findElement(By.id("experiment-restart-button")).click();

		DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
		// Set the pre defined capability – ACCEPT_SSL_CERTS value to true
		SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	//	driver = new ChromeDriver(SSLCertificate);
		Thread.sleep(1000);
		driver.get("http://192.168.2.55:8083");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).click();
		Thread.sleep(2000); 
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);			
		//personal settings
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		Thread.sleep(1000);			
		//fonts & format
		driver.findElement(By.xpath("//div[@class='messenger-settings-tab'][6]")).click();			
		Thread.sleep(300);		
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("maneesh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(200);

		//personal settings
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		Thread.sleep(300);

		//visualization
		driver.findElement(By.xpath("//div[@class='messenger-settings-tab'][8]")).click();

		Thread.sleep(300);
		//auto adjust

		driver.findElement(By.xpath("//div[@class='layout-type-radio-wrapper'][1]")).click();

		Thread.sleep(300);
		driver.navigate().refresh();

		driver.findElement(By.xpath("//div[@class='left-container ui-resizable ui-resizable-autohide']")).click();		

		Thread.sleep(300);


		WebElement a = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		Actions act = new Actions(driver);
		act.clickAndHold(a).moveByOffset(60, 90).release().perform();
		act.clickAndHold(a).moveByOffset(213, 213).perform();

		Thread.sleep(300);




		Thread.sleep(300);
		Thread.sleep(500);
	}	
}
