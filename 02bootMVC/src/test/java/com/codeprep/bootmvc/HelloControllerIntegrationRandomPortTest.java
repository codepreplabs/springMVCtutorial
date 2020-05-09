package com.codeprep.bootmvc;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationRandomPortTest {

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() throws Exception{
        ValidatableResponse responseStr = given().baseUri("http://localhost")
                .port(port).when().get("bootMVC/hello")
                .then()
                .assertThat().statusCode(HttpStatus.OK.value());
    }
}
