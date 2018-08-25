import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class AssessmentStepsImpl {

    static String bodycontent;
    static String customerId;
    static String cycleId;
    static String instanceId;
    static String userId;
    static String eventType;


    public void requestingAPI() {
        RequestSpecification request = RestAssured.given();
    }

    public long bodyEntry(String event) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("customerId", "2");
        json.put("cycleId", "1");
        json.put("instanceId", "1");
        json.put("userId", "2");
        json.put("eventType", event);
        request.body(json.toJSONString());
        Response response = request.post("http://172.16.28.71:8107/assess/metrics/event");
        customerId = json.get("customerId").toString();
        cycleId = json.get("cycleId").toString();
        instanceId = json.get("instanceId").toString();
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

    public void userIdValidation(String event) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        bodyEntry(event);
        credvalidation();
        if (userId == null) {
            RestAssured.given().when().then().statusCode(405);
        }
    }

    public void credvalidation() {
        if (customerId == null || cycleId == null || eventType == null || instanceId == null) {
            RestAssured.given().when().then().statusCode(405);
        }

    }
}