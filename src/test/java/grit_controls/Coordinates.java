package grit_controls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Coordinates {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vivo");
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@data-type='5']")).click();
  		Thread.sleep(2000);
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//div[@data-tab='4']")).click();
  		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
  		Thread.sleep(1000);
  		String a1=driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).getText();
  		driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
  		Thread.sleep(1000);
  		driver.findElement(By.xpath("(//span[@class='selected-text'])[10]")).click();
  		Thread.sleep(1000);
  		//driver.findElement(By.xpath("//div[@onscroll='coordinatesContainerScrolled()']")).click();
  		Actions ac = new Actions(driver);
  		ac.sendKeys(Keys.ARROW_DOWN).perform();
  }
}
