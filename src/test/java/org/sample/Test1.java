package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Test1 {

	@Test
	private void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FrameworkProject\\Driver\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karps");
		driver.findElement(By.id("pass")).sendKeys("kjas");
		driver.quit();
	}
	@Test
	private void tc2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FrameworkProject\\Driver\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karps");
		driver.findElement(By.id("pass")).sendKeys("kjas");
		driver.quit();
	}
	@Test
	private void tc3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FrameworkProject\\Driver\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karps");
		driver.findElement(By.id("pass")).sendKeys("kjas");
		driver.quit();
	}
	@Test
	private void tc4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FrameworkProject\\Driver\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karps");
		driver.findElement(By.id("pass")).sendKeys("kjas");
		driver.quit();
	}
}
