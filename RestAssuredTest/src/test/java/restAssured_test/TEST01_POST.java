package restAssured_test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TEST01_POST {

    @Test
    public void Test_01_post() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("name", "Raghav");
//        map.put("job", "Teacher");
//
//        System.out.println(map);

        //Using JSon Object we Print it out
        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("content-type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://reqres.in/api/users").
                then().statusCode(201);


    }

    @Test
    public void Test_02_put() {

        JSONObject request = new JSONObject();

        request.put("name", "punit");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("conten-type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://reqres.in/api/users/2").
                then().statusCode(201);

    }
}