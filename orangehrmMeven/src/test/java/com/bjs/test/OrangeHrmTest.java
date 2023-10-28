package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjs.dev.HomePage;
import com.bjs.dev.Login;

public class OrangeHrmTest {
   @SuppressWarnings("deprecation")
@Test
	public void unknownMethod() {
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
System.out.println("GitHub");

	}

}
