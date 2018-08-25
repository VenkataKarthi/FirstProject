
    import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Assert;
    public class AssessmentTriggerStepImpl {
        public static Response doGetRequest(String endpoint) {
            RestAssured.defaultParser = Parser.JSON;
            return
                    RestAssured.given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                            when().get(endpoint).
                            then().contentType(ContentType.JSON).extract().response();

        }


        public void callingAPI() {
            RestAssured.given().get("http://172.16.28.71:8107/v1.0/assess/metrics/");
        }

        public int eventTrigger(String event) {
            RestAssured.given().when().get("http://172.16.28.71:8107/v1.0/assess/metrics/scheduler?event=" + event).then().statusCode(200);

            Response response = doGetRequest("http://172.16.28.71:8107/v1.0/assess/metrics/scheduler?event=" + event);
            int statCode = response.getStatusCode();
            return statCode;

        }

        public void returnStatuscode(String event) {
            long statCode = eventTrigger(event);
            Assert.assertEquals("Failure", 200, statCode);
        }

        public void bodyValidation(String event) {
            eventTrigger(event);
            Response response = doGetRequest("http://172.16.28.71:8107/v1.0/assess/metrics/scheduler?event=" + event);
            String bodycontent = response.getBody().prettyPrint();

            Assert.assertEquals("true", bodycontent);
        }

        public void headerValidation(String event) {
            eventTrigger(event);
            Response response = doGetRequest("http://172.16.28.71:8107/v1.0/assess/metrics/scheduler?event=" + event);
            Headers allHeaders = response.headers();
            String contentType = response.header("Content-Type");
            Assert.assertEquals(contentType, "application/json;charset=UTF-8");
        }
    }

