package restAssured_test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class TEST01_PUT {

    @Test
    public void test_01_put() {

        JSONObject request = new JSONObject();
        request.put("name", "Gaurav");
        request.put("job", "QA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("content-type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://reqres.in/api/users/3").
                then().statusCode(201);


    }
}
