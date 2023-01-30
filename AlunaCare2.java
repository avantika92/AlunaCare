import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AlunaCareAPIs {

    //Test1 to verify Get API
    @Test
    public void verifyGetAPI() {
        // Specify the base URL
        RestAssured.baseURI = "/patients/identifier?name=JuanGomez&dob=1940-12-01&gender=Male";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        int statusCode = response.getStatusCode();
        ResponseBody body = response.getBody();
        // Assert that correct status code is returned.
        Assert.assertEquals(statusCode, 200 , "Correct status code returned");
        // Assert that correct response body is returned.
        String bodyAsString = body.asString();
        Assert.assertEquals(bodyAsString.contains("JUGO1940M"), true, "Response body contains Valid user identifier");
    }

    //Test2 to verify POST API 200 Success response
    @Test
    public void verifyPostAPISuccess() {
        RestAssured.baseURI ="/identity";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("identifier", "JUGO1940M");
        request.body(requestParams.toJSONString());
        Response response = request.post("/identity");
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200 , "Correct status code returned");
        Assert.assertEquals(bodyAsString.contains("{}") , true , "Response body as Expected");
    }

    //Test2 to verify POST API 409 error response
    @Test
    public void verifyPostAPISuccess() {
        RestAssured.baseURI ="/identity";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        //sending post request with existing identifier "JUGO1940M" to verify 409 error
        requestParams.put("identifier", "JUGO1940M");
        request.body(requestParams.toJSONString());
        Response response = request.post("/identity");
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 409 , "Correct status code returned");
        Assert.assertEquals(bodyAsString.contains("The record already exists") , true , "Response body as Expected");
    }

    //Test3 to verify POST API 500 Error Message response
    @Test
    public void verifyPostAPISuccess() {
        RestAssured.baseURI ="/identity";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
//        sending incomplete post data to verify 500 error
        request.body(requestParams.toJSONString());
        Response response = request.post("/identity");
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 500 , "Correct status code returned");
        Assert.assertEquals(bodyAsString.contains("<error message>") , true , "Response body as Expected");
    }

    //Test4 to verify GET API with expected response body
    @Test
    public void verifyGetAPI() {
        // Specify the base URL
        RestAssured.baseURI = "/identity?identifier=< identifier >";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/identity?identifier=JUGO1940M");

        JsonPath jsonPathEvaluator = response.jsonPath();
        String name = jsonPathEvaluator.get("name");
        String dob = jsonPathEvaluator.get("dob");
        String gender = jsonPathEvaluator.get("gender");

        // Validate the response
        Assert.assertEquals(name, "uan Gomez", "Correct user name received in the Response")&&
                Assert.assertEquals(dob, "1940-12-01", "Correct user DOB received in the Response")&&
                Assert.assertEquals(gender, "Male", "Correct user Gender received in the Response");

    }
}