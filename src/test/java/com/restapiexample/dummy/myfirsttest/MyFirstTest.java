package com.restapiexample.dummy.myfirsttest;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {

    @Test
    public void getAllEmployeeInfo() {
        //verify the data
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
