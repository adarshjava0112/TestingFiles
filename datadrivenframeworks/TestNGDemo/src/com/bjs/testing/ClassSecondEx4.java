package com.bjs.testing;
import org.testng.annotations.Test;

public class ClassSecondEx4 {
	@Test(groups="inbox")
	public void b() {
		System.out.println("b");
	}
    @Test(groups="compose")
	public void d() {
		System.out.println("d");
	}
    @Test(groups="inbox")
	public void a() {
		System.out.println("a");
	}
    @Test(groups="compose")
	public void c() {
		System.out.println("c");
	}
    @Test(groups="logout")
	public void e() {
		System.out.println("e");
	}
}
