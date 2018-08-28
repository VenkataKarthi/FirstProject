import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Referral_UIStepDefs extends Referral_UIStepsImpl {
    @Given("^the user navigates to peoplehum with a referral account$")
    public void theUserNavigatesToPeoplehumWithAReferralAccount() {
        // Write code here that turns the phrase above into concrete actions
        navigateToPplHum();

    }

    @When("^the user enters an individual account's \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserEntersAnIndividualAccountSAnd(String username, String password) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        loginToPplHum(username, password);

    }

    @Then("^the user will be able to access the referral Applications$")
    public void theUserWillBeAbleToAccessTheReferralApplications() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        referralUser();
    }

    @And("^the user can upload a resume for referral$")
    public void theUserCanUploadAResumeForReferral() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        uploadReferralResume();
    }


}