import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
public void firstMethod() {
	System.out.println("first");
}
@Test
public void secondMethod() {
	System.out.println("second");
}
@BeforeMethod
public void thirdMethod() {
	System.out.println("thirdMethod");
}
@AfterMethod
public void fourthMethod() {
	System.out.println("fourthMethod");
}
@BeforeClass
public void fifthMethod() {
	System.out.println("fifthMethod");
}
@AfterClass
public void sixthMethod() {
	System.out.println("sixthMethod");
}

}
