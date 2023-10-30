package com.bjs.Oranangehrmdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
		ChromeDriver driver;
		@FindBy(xpath="//input[@name='username']")
		WebElement un;
		@FindBy(xpath="//input[@name='password']")
		WebElement pw;
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		
		public Login(ChromeDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public void typeUsername() 
		{
			un.sendKeys("Admin");
		}
		
		public void typePassword() {
			pw.sendKeys("admin123");
		}
		
		public void clickSubmitButton() {
			submit.click();
		}

}
