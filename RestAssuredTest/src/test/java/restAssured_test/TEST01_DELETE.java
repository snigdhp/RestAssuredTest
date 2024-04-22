package restAssured_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TEST01_DELETE {

    @Test
    public void test_01_delete() {

       when().
               delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
    }
}
