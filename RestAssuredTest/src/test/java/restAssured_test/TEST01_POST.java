package restAssured_test;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class TEST01_POST {

    @Test
    public void Test_01_post() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Raghav");
        map.put("job", "Teacher");

        System.out.println(map);
    }
}