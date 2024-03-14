package restfulBooker;

import io.restassured.RestAssured;

public class PathParameterExampleInLineParameters {
    public static void main(String[] args) {
        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                //.basePath("{basePath}/{bookingId}")
                //.pathParam("basePath","booking")
                //.pathParam("bookingId",2)
                .when()
                .get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",2)
                .then()
                .log()
                .all()
                .statusCode(200);

    }

}
