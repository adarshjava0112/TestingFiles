package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.Orangehrmdemo2.HomePage;
import com.bjs.Orangehrmdemo2.Login;
import com.sun.tools.javac.util.Log;

public class OrangeHrmDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d =new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Login l=new Login(d);
l.typeUsername();
l.typePassword();
l.clickSubmitButton();

HomePage h=new HomePage(d);
h.clickoInc();


	}

}
