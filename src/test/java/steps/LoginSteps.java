package steps;

import cucumber.api.java.en.Given;

public class LoginSteps {

    @Given("the user navigates to the Book Cart application")
    public void theUserNavigatesToTheBookCartApplication() {
        System.out.println("Hey I am mapped");
    }
}

  /*  @When("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enter the username as ortoni")
    public void userEnterTheUsernameAsOrtoni() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user enters the password as Pass{int}")
    public void theUserEntersThePasswordAsPass(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the login should be successful")
    public void theLoginShouldBeSuccessful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}*/
