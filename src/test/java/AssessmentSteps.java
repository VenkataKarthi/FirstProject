
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssessmentSteps extends AssessmentStepsImpl {


    @Given("^the user navigates to Assessment API$")
    public void theUserNavigatesToAssessmentAPI() {
        requestingAPI();
    }

    @When("^the body of the Assessment API is updated with \"([^\"]*)\"$")
    public void theBodyOfTheAssessmentAPIIsUpdatedWith(String event) {
        bodyEntry(event);

    }

    @Then("^the Assessment API returns success when hit with \"([^\"]*)\"$")
    public void theAssessmentAPIReturnsSuccessWhenHitWith(String event) {
        eventSuccess(event);
    }


    @And("^the body response is validated corresponding to \"([^\"]*)\"$")
    public void theBodyResponseIsValidatedCorrespondingTo(String event) {
        // Write code here that turns the phrase above into concrete actions
        bodyValidation(event);
    }

    @When("^the body of the Assessment API is updated with \"([^\"]*)\" and mandatory credentials$")
    public void theBodyOfTheAssessmentAPIIsUpdatedWithAndMandatoryCredentials(String event) {
        mandatoryBodyCreds(event);

    }

    @When("^the body of the Assessment API is updated with \"([^\"]*)\" and mandatory credentials with UserId$")
    public void theBodyOfTheAssessmentAPIIsUpdatedWithAndUserIdCredentials(String event) {
        userIdValidation(event);
    }
}