package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdateBookingPATCH {
    public static void main(String[] args) {
        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/1")
                .body("{\n" +
                        "    \"firstname\" : \"James\",\n" +
                        "    \"lastname\" : \"Brown\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                .patch()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }
}
