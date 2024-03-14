package restfulBooker;

import io.restassured.RestAssured;

public class DeleteBooking {
    public static void main(String[] args) {
        //Build Request
        RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/{bookingId}")
                .pathParam("bookingId",5)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .header("Content-Type","application/json")
                .when()
                .delete()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(201);
        //Hit Request and get Response

        //Validate Response
    }
}
