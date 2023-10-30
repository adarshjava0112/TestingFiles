package com.bjs.testing;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationDemo {
@Test
@Parameters({"url","username","password"})
public void testMethod(String url,String un,String pass) {
	System.out.println(url+" "+un+" "+pass);
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get(url);
	d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
    d.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
    d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);	
	d.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
}
}
