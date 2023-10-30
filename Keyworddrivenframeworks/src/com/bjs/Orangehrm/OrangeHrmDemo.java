package com.bjs.Orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
FileInputStream file=new FileInputStream("D:\\Java_programs_BJS\\Automation_Files\\FrameWorks\\KeyWordDrivenFrameworks\\src\\com\\bjs\\utilities\\KeywordDrivenFrameWorks.properties");
Properties p=new Properties();
p.load(file);
String un=p.getProperty("usernameXpath");
String pw=p.getProperty("passwordXpath");
String btn=p.getProperty("submitbuttonXpath");
System.out.println(un+" "+pw+" "+btn);
d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
d.findElement(By.xpath(un)).sendKeys("Admin");
d.findElement(By.xpath(pw)).sendKeys("admin123");
d.findElement(By.xpath(btn)).click();

	}

}
