package com.bjs.orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		FileInputStream file=new FileInputStream("D:\\Java_programs_BJS\\Automation_Files\\FrameWorks\\src\\com\\bjs\\utilities\\data.properties");
		Properties p=new Properties();
		p.load(file);
		String url=p.getProperty("url");
		String user=p.getProperty("username");
		String pass=p.getProperty("password");
		System.out.println(url + " "+user+" "+pass);
		d.get(url);
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		Thread.sleep(5000);
		WebElement submit=d.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

}
