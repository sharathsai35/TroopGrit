package Calling;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class NewTest1 {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ATUTestRecorder recorder;
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
		driver.get("https://testing.troopmessenger.com/messenger");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-app='conference']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='btn join-btn pure-material-button-contained text-white ']")).click();
		Thread.sleep(5000);
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("https://testing.troopmessenger.com/cattle-call/join-call?o=89425341&t=gmY4yTf9m6IPjZy298Z8fclJIRVcHqiN");
		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		driver1.findElement(By.xpath("//button[@id='joinMeetingButton']")).click();
		Thread.sleep(5000);
		ChromeOptions option = new ChromeOptions();
		DesiredCapabilities capabilitie = DesiredCapabilities.chrome();
		ChromeDriver driver2 = new ChromeDriver(option);
		option.addArguments("--incognito1");
		capabilitie.setCapability(ChromeOptions.CAPABILITY, option);
		driver2.get("https://testing.troopmessenger.com/cattle-call/join-call?o=89425341&t=gmY4yTf9m6IPjZy298Z8fclJIRVcHqiN");
		driver2.findElement(By.xpath("//input[@type='text']")).sendKeys("test1");
		driver2.findElement(By.xpath("//button[@id='joinMeetingButton']")).click();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");

		driver = new ChromeDriver();
		driver.get("chrome://flags");

		//adding chrome flags in automation browser

		ChromeOptions options = new ChromeOptions()
				.addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:8083");
		driver.manage().window().maximize();
		//for clicking allow  on notifications & microphone
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("profile.default_content_setting_values.microphone", 2);
		options.setExperimentalOption("prefs", prefs);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://testing.troopmessenger.com/messenger");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("uppi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(500);
		//click on user
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(300);
		//click on microphone
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(300);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
	}
	@Test
	public void test1() throws InterruptedException, ATUTestRecorderException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.managed_default_content_settings.notifications", 2);
		prefs.put("profile.default_content_setting_values.microphone", 2);
		prefs.put("profile.default_content_setting_values.notifications", 2);        
		prefs.put("credentials_enable_service", false); 
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("use-fake-ui-for-media-stream");
		options.addArguments("start-maximized");
		options.addArguments("--disable-extensions");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://testing.troopmessenger.com/messenger");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("uppi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-app='conference']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		/*
		 * driver.findElement(By.
		 * xpath("//button[@class='bg-green btn start-conference--icon mb-3 pure-material-button-contained']"
		 * )).click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='meetingTitle']")).sendKeys("test");
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='meetingFromTime']")).click();
		 * driver.findElement(By.xpath("//span[@class='hour active hour_pm']")).click();
		 * driver.findElement(By.xpath("(//span[@class='minute'])[7]")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='meetingToTime']")).click();
		 * driver.findElement(By.xpath("(//span[@class='hour active hour_pm'])[2]")).
		 * click();
		 * driver.findElement(By.xpath("(//span[@class='minute'])[10]")).click();
		 * Thread.sleep(1000); driver.findElement(By.
		 * xpath("//div[@class='add-internal-users pure-material-button-contained']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='usersModalInputSearch']")).sendKeys
		 * ("maneesh");
		 * driver.findElement(By.xpath("//div[@data-search='Maneesh']")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='usersModalInputSearch']")).sendKeys
		 * ("sharath");
		 * driver.findElement(By.xpath("//div[@data-search='sharath']")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//button[@id='scheduleCallBtn']")).click();
		 * Thread.sleep(3000);
		 */
		driver.findElement(By.xpath("//a[@class='btn start-btn pure-material-button-contained text-white bg-green ']")).click();
		Thread.sleep(5000);
		ChromeOptions options1 = new ChromeOptions();
		Map<String, Object> prefs1 = new HashMap<String, Object>();
		prefs1.put("profile.default_content_setting_values.notifications", 2);
		prefs1.put("credentials_enable_service", false);
		prefs1.put("profile.password_manager_enabled", false);
		prefs1.put("profile.managed_default_content_settings.notifications", 2);
		prefs1.put("profile.default_content_setting_values.microphone", 2);
		prefs1.put("profile.default_content_setting_values.notifications", 2);        
		prefs1.put("credentials_enable_service", false); 
		prefs1.put("profile.password_manager_enabled", false);
		options1.setExperimentalOption("prefs", prefs1);
		options1.addArguments("start-maximized");
		options1.addArguments("disable-infobars");
		options1.addArguments("--disable-extensions");
		options1.addArguments("--disable-notifications");
		options1.addArguments("--disable-infobars");
		options1.addArguments("use-fake-ui-for-media-stream");
		options1.addArguments("start-maximized");
		options1.addArguments("--disable-extensions");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		options1.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options1);
		ChromeDriver driver1 = new ChromeDriver(options1);
		driver1.get("https://testing.troopmessenger.com/messenger");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tm.com");
		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@data-app='conference']")).click();
		Thread.sleep(5000);
		driver1.switchTo().frame(0);
		driver1.findElement(By.xpath("//button[@class='btn join-btn pure-material-button-contained text-white ']")).click();
		Thread.sleep(5000);
		ChromeOptions options2 = new ChromeOptions();
		Map<String, Object> prefs2 = new HashMap<String, Object>();
		prefs2.put("profile.default_content_setting_values.notifications", 2);
		prefs2.put("credentials_enable_service", false);
		prefs2.put("profile.password_manager_enabled", false);
		prefs2.put("profile.managed_default_content_settings.notifications", 2);
		prefs2.put("profile.default_content_setting_values.microphone", 2);
		prefs2.put("profile.default_content_setting_values.notifications", 2);        
		prefs2.put("credentials_enable_service", false); 
		prefs2.put("profile.password_manager_enabled", false);
		options2.setExperimentalOption("prefs", prefs2);
		options2.addArguments("start-maximized");
		options2.addArguments("disable-infobars");
		options2.addArguments("--disable-extensions");
		options2.addArguments("--disable-notifications");
		options2.addArguments("--disable-infobars");
		options2.addArguments("use-fake-ui-for-media-stream");
		options2.addArguments("start-maximized");
		options2.addArguments("--disable-extensions");
		DesiredCapabilities capabilities1 = DesiredCapabilities.chrome();
		options2.addArguments("incognito");
		capabilities1.setCapability(ChromeOptions.CAPABILITY, options2);
		ChromeDriver driver2 = new ChromeDriver(options2);
		driver2.get("https://testing.troopmessenger.com/messenger");
		driver2.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@data-app='conference']")).click();
		Thread.sleep(5000);
		driver2.switchTo().frame(0);

		driver2.findElement(By.xpath("//button[@class='btn join-btn pure-material-button-contained text-white ']")).click();
		Thread.sleep(5000);
		ChromeOptions options3 = new ChromeOptions();
		Map<String, Object> prefs3 = new HashMap<String, Object>();
		prefs3.put("profile.default_content_setting_values.notifications", 2);
		prefs3.put("credentials_enable_service", false);
		prefs3.put("profile.password_manager_enabled", false);
		prefs3.put("profile.managed_default_content_settings.notifications", 2);
		prefs3.put("profile.default_content_setting_values.microphone", 2);
		prefs3.put("profile.default_content_setting_values.notifications", 2);        
		prefs3.put("credentials_enable_service", false); 
		prefs3.put("profile.password_manager_enabled", false);
		options3.setExperimentalOption("prefs", prefs3);
		options3.addArguments("start-maximized");
		options3.addArguments("disable-infobars");
		options3.addArguments("--disable-extensions");
		options3.addArguments("--disable-notifications");
		options3.addArguments("--disable-infobars");
		options3.addArguments("use-fake-ui-for-media-stream");
		options3.addArguments("start-maximized");
		options3.addArguments("--disable-extensions");
		DesiredCapabilities capabilities2 = DesiredCapabilities.chrome();
		options3.addArguments("incognito");
		capabilities2.setCapability(ChromeOptions.CAPABILITY, options3);
		ChromeDriver driver3 = new ChromeDriver(options3);
		driver3.get("https://testing.troopmessenger.com/messenger");
		driver3.findElement(By.xpath("//input[@name='email']")).sendKeys("do@tm.com");
		driver3.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver3.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@data-app='conference']")).click();
		Thread.sleep(5000);
		driver3.switchTo().frame(0);
		driver3.findElement(By.xpath("//button[@class='btn join-btn pure-material-button-contained text-white ']")).click();
		Thread.sleep(300000);
		/*
		 * ChromeOptions option2 = new ChromeOptions(); DesiredCapabilities
		 * capabilities2 =DesiredCapabilities.chrome(); ChromeDriver driver4 = new
		 * ChromeDriver(option2); option2.addArguments("--incognito3");
		 * capabilities2.setCapability(ChromeOptions.CAPABILITY, option);
		 * driver4.get("https://testing.troopmessenger.com/messenger");
		 * driver4.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "akhil@tm.com");
		 * driver4.findElement(By.xpath("//input[@name='password']")).sendKeys("123456")
		 * ; driver4.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		 * Thread.sleep(2000);
		 * driver4.findElement(By.xpath("//div[@data-app='conference']")).click();
		 * Thread.sleep(5000); driver4.switchTo().frame(0); driver4.findElement(By.
		 * xpath("//button[@class='btn join-btn pure-material-button-contained text-white ']"
		 * )).click(); Thread.sleep(5000);
		 */
	}
	@Test
	public void test3() throws InterruptedException, ATUTestRecorderException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/cattle-call/join-call?o=86119148&t=gmY4yTf9m6IPjZy298Z8fclJIRVcHqiN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("User-A");
		driver.findElement(By.xpath("//button[@id='joinMeetingButton']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='mic-btn'])[2]")).click();
		Thread.sleep(5000);
	}
	
}
