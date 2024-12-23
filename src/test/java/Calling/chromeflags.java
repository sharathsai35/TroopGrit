package Calling;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class chromeflags {
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:8083");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:8083");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sharath1");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		Map<String, Object> prefs = new HashMap<String, Object>();
  	    
  		//Put this into prefs map to switch off browser notification
  		prefs.put("profile.default_content_setting_values.notifications", 1);
  		options.setExperimentalOption("prefs", prefs);
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
  		Thread.sleep(1000);
  		
  		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
  		ChromeDriver driver1 = new ChromeDriver(options);
  		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
  		driver1.get("http://192.168.2.55:8083/user/login");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("maneesh");
		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@class='audio-call-header-btn']")).click();
  		Thread.sleep(2000); 
  	   
  		//Put this into prefs map to switch off browser notification
  		prefs.put("profile.default_content_setting_values.notifications", 1);
  		options.setExperimentalOption("prefs", prefs);
  		Thread.sleep(1000);
	}
}
