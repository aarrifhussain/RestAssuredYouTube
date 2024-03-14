package restfulBooker;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class PathParameterExampleUsingMap {
    public static void main(String[] args) {

        Map<String,Object> pathParams= new HashMap<>();
        pathParams.put("basePath","booking");
        pathParams.put("bookingId",2);


        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{basePath}/{bookingId}")
                .pathParams(pathParams)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }

}
