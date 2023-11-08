package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("I want to write a step with precondition");
	}

	@When("^I complete action$")
	public void i_complete_action() {
		System.out.println("I complete action"); 
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}

	@And("^check more outcomes$")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
	}

	@But("^My parents are satisfied$")
	public void my_parents_are_satisfied() {
		System.out.println("My parents are satisfied");
	}
}
