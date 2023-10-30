package com.bjs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class DataProviderDemo {

	@DataProvider(name="authenticationn")
	public Object[][] authentication(){
		Object[][] a=new Object[3][2];
		a[0][0]="Admin";
		a[0][1]="admin123";
		a[1][0]="Admin";
		a[1][1]="admin1234";
		a[2][0]="Admin";
		a[2][1]="admin12345";
		
		return a;
	}
	
	@Test(dataProvider="authenticationn")
	public void testMethod(String un,String pass) {
		System.out.println(" "+un+" "+pass);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
	    d.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);	
		d.findElement(By.xpath("//button[@type='submit']")).click();
}
}
