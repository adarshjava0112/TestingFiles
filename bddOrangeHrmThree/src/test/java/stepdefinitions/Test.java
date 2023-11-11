package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class Test {
	ChromeDriver d;
	Login l;
	@Given("^QA environment is up and running$")
	public void qa_environment_is_up_and_running() {
	    d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    l=new Login(d);
	}

	@When("^a user enter username$")
	public void a_user_enter_username() {
	   
	   l.typeUsername();
	   
	      
	}

	@Then("^enter password$")
	public void enter_password() {
	    System.out.println("enter password");
	    l.typePassword();
	}

	@And("^clicks login then user should see homepage$")
	public void clicks_login_then_user_should_see_homepage() {
	    System.out.println("clicks login then user should see homepage");
	    l.clickSubmitButton();
	}
}
