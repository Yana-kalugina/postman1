package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldWorkPostman() {
        given()
                .baseUri("http://postman-echo.com")
                .body("Postman")
                .when()
                .post("/post")
                .then()
                .statusCode(401)
                .body("data", equalTo("Postman"))
        ;
    }
}
