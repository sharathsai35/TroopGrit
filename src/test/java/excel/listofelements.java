package excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class listofelements {
	WebDriver driver;
	@Test
	public void test12() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("http://192.168.2.19:8080/user/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sharath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		//driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).perform();
    	List<WebElement> buttons = driver.findElements(By.className("user-name"));
    	System.out.println("   "+buttons.size());
    	for(WebElement button : buttons){
    	System.out.println(button.getText());
    	}
    	driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
	}
}
