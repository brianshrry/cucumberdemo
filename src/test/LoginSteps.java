package cucumberdemo.src.test.resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

@CucumberOptions(glue={"classpath:stepdefinitions"})
public class LoginSteps {
	@Given("I have a login page on this new web application")
	public void loginPage() {
		System.out.println("step 1: I'm on the login page");
		throw new io.cucumber.java.PendingException();
	}
	@When("I enter valid credentials")
	public void validLogin() {
		System.out.println("step 2: I'm entering credentials");
		throw new io.cucumber.java.PendingException();
	}
	@And("I click submit button")
	public void submitButton() {
		System.out.println("step 3: I'm clicking submit");
		throw new io.cucumber.java.PendingException();
	}
	@Then("I confirm that the account has been logged in")
	public void successfulLogin() {
		System.out.println("step 4: I've successfully logged in");
		throw new io.cucumber.java.PendingException();
	}
}