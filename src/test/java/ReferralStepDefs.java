import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class ReferralStepDefs {
    RequestSpecification httpRequest ;
    Response response;
    @Step
    @Given("^login page$")
    public void loginPage() {
        // Write code here that turns the phrase above into concrete actions
       // httpRequest = RestAssured.given();
        httpRequest = RestAssured.given().header("userd","1574").header("customerId","2").header("Cookie","token=MGRmNjY3MWM2OWVjM2EwMjU0NmMwY2ZlNWU4NTc0YjUyM2E4ODA4MGFkZDI5NTgyLzI4Ng%3D%3D; io=DrpM3faS5UV2tOx6AAHb").param("resumePath","%2Fapi%2Fdata-processor%2Fv1.0%2FcustomerId%2F2%2Fattachment%2FBOk8SzUI0vbQiEn.pdf%3Ftoken%3D2890821506b02-7411-429c-a780-ac511e03f91e10299");
        //httpRequest = RestAssured.given().header("Accept-Encoding"," gzip, deflate, br").header("Accept-Language"," en-US,en;q=0.9").header("Connection"," keep-alive").header("Cookie"," token=MGRmNjY3MWM2OWVjM2EwMjU0NmMwY2ZlNWU4NTc0YjUyM2E4ODA4MGFkZDI5NTgyLzI4Ng%3D%3D; io=Hq-YigQh_Wh7YsR2AAD4").header("Host"," beta.peoplehum.qa").header("Referer"," https://beta.peoplehum.qa/main/app/referrals/form").header("User-Agent"," Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36").header("UserId","344").header("CustomerId","2").param("resumePath","/api/data-processor/v1.0/customerId/2/attachment/DT859AJB2Ipuvhm.docx?token=8871908734543-5783-43c7-9dac-5c0291c27b8156670");
      // httpRequest = RestAssured.given().header("Accept", "application/json, text/plain, */*").header("Content-Type" ,"application/json,text/plain, */*").header("Accept-Encoding","gzip, deflate, br").header("Accept-Language","en-US,en;q=0.9").header("Connection","keep-alive").header("CustomerId","2").header("UserId","344").header("Cookie","io=Y4n3UJzEQ6g15nARAAPJ").header("Host","beta.peoplehum.qa").header("Referer","https://beta.peoplehum.qa/main/app/referrals/form").header("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36").header("Host" ,"beta.peoplehum.qa").header("Origin","https://beta.peoplehum.qa\n").header("Referer"," https://beta.peoplehum.qa/login?url=/main/app/referrals/form\n").header("Content","Length: 61");
       // JSONObject json = new JSONObject();
       // json.put("username","venkatakarthi2@gmail.com");
       // json.put("password","Test@123");
       // Response response = httpRequest.post("https://beta.peoplehum.qa/internal-api/login");
        //long statcode = response.getStatusCode();
       // System.out.println(statcode);Accept: application/json, text/plain, */*
//Accept-Encoding: gzip, deflate, br
//Accept-Language: en-US,en;q=0.9
//Connection: keep-alive
//Cookie: token=MGRmNjY3MWM2OWVjM2EwMjU0NmMwY2ZlNWU4NTc0YjUyM2E4ODA4MGFkZDI5NTgyLzI4Ng%3D%3D; io=Hq-YigQh_Wh7YsR2AAD4
//Host: beta.peoplehum.qa
//Referer: https://beta.peoplehum.qa/main/app/referrals/form
//User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36
    }

    @When("^tries to login$")
    public void triesToLogin() {
   response = httpRequest.when().get("http://beta.peoplehum.qa/api/ats/v3/customer/2/refer/preview");
   response.prettyPrint();
        // Write code here that turns the phrase above into concrete actions
    }


    @Then("^login should successful$")
    public void loginShouldSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // RestAssured.baseURI = https://beta.peoplehum.qa/api/ats/v3/customer/2/refer/preview;
        RestAssured.given().when().then().statusCode(200);
     // response.then().statusCode(200);
//        throw new PendingException();
    }

}
