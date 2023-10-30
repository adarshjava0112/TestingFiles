import org.testng.annotations.Test;

public class ClassSecondEx3 {
	@Test
	public void b() {
		System.out.println("b");
	}
    @Test(priority=3)
	public void d() {
		System.out.println("d");
	}
    @Test(priority=2)
	public void a() {
		System.out.println("a");
	}
    @Test
	public void c() {
		System.out.println("c");
	}
}
