import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Recruit_UIStepDefs extends Recruit_UIStepsImpl {
    @Given("^the user navigates to peoplehum$")
    public void theUserNavigatesToPeoplehum() {
        // Write code here that turns the phrase above into concrete actions
        navigateToPplHum();

    }

    @When("^the user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserEntersValidAnd(String username, String password) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        loginToPplHum(username, password);
    }


    @And("^the user is a valid recruiter$")
    public void theUserIsAValidRecruiter() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        validUser();
    }

    @Then("^the user will be able to access the Recruiter Applications$")
    public void theUserWillBeAbleToAccessTheRecruiterApplications() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        displayApplications();
    }

    @Then("^the user must be able to upload a resume$")
    public void theUserMustBeAbleToUploadAResume() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        uploadResume();
    }


}