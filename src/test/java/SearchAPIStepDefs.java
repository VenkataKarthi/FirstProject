import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAPIStepDefs extends SearchStepImpl {
    @Given("^the user is hitting global search API$")
    public void theUserIsHittingGlobalSearchAPI() {
        // Write code here that turns the phrase above into concrete actions
        requestingAPI();

    }

    @When("^the body of the Search API is updated with \"([^\"]*)\"$")
    public void theBodyOfTheSearchAPIIsUpdatedWith(String event) {
        // Write code here that turns the phrase above into concrete actions
        bodyEntry(event);
    }

    @And("^the request body Credentials is validated with \"([^\"]*)\"$")
    public void theRequestBodyCustomerIdIsValidatedWith(String event) {
        contentValidation(event);

    }

    @Then("^the request returns success triggered by \"([^\"]*)\"$")
    public void theRequestReturnsSuccessTriggeredBy(String event) {
        // Write code here that turns the phrase above into concrete actions
        eventSuccess(event);
    }

    @And("^the search body response is validated corresponding to \"([^\"]*)\"$")
    public void theSearchBodyResponseIsValidatedCorrespondingTo(String event) {
        // Write code here that turns the phrase above into concrete actions
        bodyValidation(event);

    }



}
