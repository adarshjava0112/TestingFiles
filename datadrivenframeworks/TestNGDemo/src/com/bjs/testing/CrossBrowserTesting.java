package com.bjs.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters({"browse"})
	public void options(String browser)
	{
		System.out.println(browser);
		if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
	}
	
	
	@Test
	public void testMethod()
	{
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}

