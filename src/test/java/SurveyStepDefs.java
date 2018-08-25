import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SurveyStepDefs extends SurveyStepsImpl{
    @Given("^the user navigates to Survey API$")
    public void theUserNavigatesToSurveyAPI() {
        requestingAPI();

    }

    @When("^the body of the Survey API is updated with \"([^\"]*)\"$")
    public void theBodyOfTheSurveyAPIIsUpdatedWith(String event) {

        bodyEntry(event);
    }

    @Then("^the Survey API returns success when hit with \"([^\"]*)\"$")
    public void theSurveyAPIReturnsSuccessWhenHitWith(String event) {

        eventSuccess(event);
    }

    @And("^the survey body response is validated corresponding to \"([^\"]*)\"$")
    public void theSurveyBodyResponseIsValidatedCorrespondingTo(String event) {
        bodyValidation(event);

    }

    @And("^the credentials with \"([^\"]*)\" are verified$")
    public void theCredentialsWithAreVerified(String event) {
        mandatoryBodyCreds(event);
    }
}
