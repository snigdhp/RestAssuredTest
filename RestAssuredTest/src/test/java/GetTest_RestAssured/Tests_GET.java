package GetTest_RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class Tests_GET {

//    @Test
//    public void test_01(){
//
//        given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
//
//    }

    @Test
    public void Test_GET() {
        given().get("ttps://reqres.in/api/users?page=2").then()
                .statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name",equalTo("Michael,Lindsay"));




    }
}