package com.bjs.Orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ChromeDriver d = new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
FileInputStream file=new FileInputStream("D:\\Java_programs_BJS\\Automation_Files\\FrameWorks\\HybridDrivenFrameworks\\src\\com\\bjs\\utilities\\HybridDrivenFrameWorks.properties");
Properties p=new Properties();
p.load(file);
String sub=p.getProperty("submitbuttonXpath");
String pw=p.getProperty("passwordXpath");
String un=p.getProperty("usernameXpath");
String url=p.getProperty("url");
String und=p.getProperty("username");
String pwd=p.getProperty("password");
System.out.println(sub+ " "+pw+" "https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1549+un+" "+url+" "+und+" "+pwd);
d.get(url);
d.findElement(By.xpath(un)).sendKeys(und);
d.findElement(By.xpath(pw)).sendKeys(pwd);
d.findElement(By.xpath(sub)).click();
	}

}
