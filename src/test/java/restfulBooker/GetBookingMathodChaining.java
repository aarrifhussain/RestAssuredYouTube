package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBookingMathodChaining {
    public static void main(String[] args) {
        //Build Request
        RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/{id}")
                .pathParam("id", "10")
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
