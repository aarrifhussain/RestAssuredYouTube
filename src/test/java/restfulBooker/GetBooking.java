package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {
    public static void main(String[] args) {
        //Build Request
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification=requestSpecification.log().all();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/{id}");
        requestSpecification.pathParam("id","1");
        //Hit Request and get Response
        Response response=requestSpecification.get();
        //Validate Response
        ValidatableResponse validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);
    }
}
