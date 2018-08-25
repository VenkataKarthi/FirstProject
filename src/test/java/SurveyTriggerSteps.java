import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SurveyTriggerSteps extends SurveyTrigStepsImpl {


    @Given("^the user is calling the Survey Trigger API$")
    public void theUserIsCallingTheSurveyTriggerAPI() {
        // Write code here that turns the phrase above into concrete actions
        callingAPI();
    }

    @When("^the user performs a get request to the Survey Trigger API$")
    public void theUserPerformsAGetRequestToTheSurveyTriggerAPI() {
        // Write code here that turns the phrase above into concrete actions
        callingAPI();
    }

    @And("^the user is triggering Survey \"([^\"]*)\"$")
    public void theUserIsTriggeringSurvey(String event) {
        // Write code here that turns the phrase above into concrete actions
        eventTrigger(event);

    }

    @Then("^the request returns success triggered by Survey \"([^\"]*)\"$")
    public void theRequestReturnsSuccessTriggeredBySurvey(String event) {
        // Write code here that turns the phrase above into concrete actions
        returnStatuscode(event);

    }

    @And("^the body is validated based on the Survey \"([^\"]*)\"$")
    public void theBodyIsValidatedBasedOnTheSurvey(String event) {
        // Write code here that turns the phrase above into concrete actions
        bodyValidation(event);

    }

    @And("^header validation is performed based on Survey \"([^\"]*)\"$")
    public void headerValidationIsPerformedBasedOnSurvey(String event) {
        // Write code here that turns the phrase above into concrete actions
        headerValidation(event);

    }
}