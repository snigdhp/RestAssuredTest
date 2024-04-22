package restAssured_test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TEST01_PATCH {

    @Test
    public void test_02_patch() {

        JSONObject request = new JSONObject();
        request.put("name", "Test");
        request.put("job", "TESTQA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().header("content-type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().patch("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();

    }


}
