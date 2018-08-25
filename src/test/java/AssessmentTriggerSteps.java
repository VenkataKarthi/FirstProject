import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssessmentTriggerSteps extends AssessmentTriggerStepImpl{


    @Given("^the user is calling the Assignment Trigger API$")
    public void theUserIsCallingTheAPI() {
        // Write code here that turns the phrase above into concrete actions
        callingAPI();
    }

    @When("^the user performs a get request to the Assessment Trigger API$")
    public void theUserPerformsAGetRequest() {
        callingAPI();

    }

    @And("^the user is triggering Assessment \"([^\"]*)\"$")
    public void theUserIsTriggeringAssignment(String event) {
        eventTrigger(event);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^the body is validated based on the Assessment \"([^\"]*)\"$")
    public void theBodyIsValidatedBasedOnThe(String event) {
        // Write code here that turns the phrase above into concrete actions
        bodyValidation(event);
    }


    @And("^header validation is performed based on Assessment \"([^\"]*)\"$")
    public void headerValidationIsPerformedBasedOn(String event) {
        // Write code here that turns the phrase above into ccrete actions
        headerValidation(event);
    }


    @Then("^the request returns success triggered by Assessment \"([^\"]*)\"$")
    public void theRequestReturnsSuccessTriggeredByAssessment(String event) {
        // Write code here that turns the phrase above into concrete actions
        returnStatuscode(event);

    }
}


