package desktop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


@RunWith(JUnit4.class)
public class electron {
	static WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/opt/Troop GRIT/Troop GRIT");
		options.setCapability("chromeOptions", options);
		options.setCapability("browserName", "chrome");
		Thread.sleep(3000);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.5.52:8083");
		driver.findElement(By.id("submitBtn")).click();
		System.out.print("driver.findElements(By.id(\"submitBtn\")).size()"+ driver.findElements(By.id("submitBtn")).size());
		
	}

	@Test
	public void test() throws InterruptedException {

		System.out.print("line executed");
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("loginBtn")).click();

	}

	@After
	public void teardown() {
		//driver.quit();
	}
}

