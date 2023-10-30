package com.bjs.Oranangehrmdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	ChromeDriver driver;
@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
WebElement oInc;
public HomePage(ChromeDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickoInc() {
	oInc.click();
}

}
