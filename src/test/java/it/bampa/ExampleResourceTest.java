package it.bampa;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testApiV1Endpoint() {
        given()
          .when().get("/example/apiV1")
          .then()
             .statusCode(200)
             .body(is("v1"));
    }

}
