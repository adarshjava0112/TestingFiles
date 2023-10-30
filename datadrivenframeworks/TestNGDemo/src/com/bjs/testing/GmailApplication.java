package com.bjs.testing;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class GmailApplication {
    @Test
	public void login() {
    //Assert.fail();
		System.out.println("Login successful");
	}
    @Test(invocationCount=5)
	public void compose() {
		System.out.println("compose successful");
	}
    @Test
	public void inbox() {
		System.out.println("inbox successful");
	}
    @Test(dependsOnMethods="login",alwaysRun=true)
	public void logout() {
		System.out.println("logout successful");
	}
}
