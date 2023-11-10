package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

	@Given("^I am maual tester$")
	public void i_am_maual_tester() {
	   System.out.println("I am maual tester");
	}

	@When("^I apply for new job$")
	public void i_apply_for_new_job() {
		System.out.println("I apply for new job");
	}

	@Then("^I get less salary$")
	public void i_get_less_salary() {
		System.out.println("I get less salary");
	}

	@And("^I am not satisfied with salary$")
	public void i_am_not_satisfied_with_salary() {
		System.out.println("I am not satisfied with salary");
	}

	@But("^My parents are satisfied$")
	public void my_parents_are_satisfied() {
		System.out.println("My parents are satisfied");
	}
}
