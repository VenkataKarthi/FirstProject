import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
public class DataProcessorStepDefs {
    RequestSpecification httpRequest;
    Response response;
    @Step
    @Given("^login$")
    public void login()
    {
        //httpRequest = RestAssured.given().header("","")
    }

    @When("^tries login$")
    public void triesLogin()
    {

    }
    @Then("^login  successful$")
    public void loginSuccessful()
    {

    }
}
