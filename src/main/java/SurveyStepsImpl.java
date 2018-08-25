import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class SurveyStepsImpl {
    static String bodycontent;
    static String customerId;
    static String surveyInstanceId;
    static String eventType;


    public void requestingAPI() {
        RequestSpecification request = RestAssured.given();
    }

    public long bodyEntry(String event) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("customerId", "2");
        json.put("surveyInstanceId", "1");
        json.put("eventType", event);
        request.body(json.toJSONString());
        Response response = request.post("http://172.16.28.71:8107/survey/metrics/event");
        customerId = json.get("customerId").toString();
        surveyInstanceId = json.get("surveyInstanceId").toString();
        eventType = json.get("eventType").toString();
        bodycontent = response.getBody().prettyPrint();
        long statCode = response.getStatusCode();
        return statCode;
    }

    public void eventSuccess(String event) {
        long statCode = bodyEntry(event);
        Assert.assertEquals(200, statCode);

    }

    public void bodyValidation(String event) {
        bodyEntry(event);
        Assert.assertEquals("true", bodycontent);
    }

    public void mandatoryBodyCreds(String event) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        bodyEntry(event);
        credvalidation();
    }

    public void credvalidation() {
        if (customerId == null || eventType == null || surveyInstanceId == null) {
            RestAssured.given().when().then().statusCode(405);
        }

    }
}
