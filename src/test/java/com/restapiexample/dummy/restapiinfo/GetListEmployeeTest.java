package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetListEmployeeTest extends TestBase {

    @Test
    public void getAllEmployee() {
        Response response = given()
                .header("cookie", "humans_21909=1")
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getEmployeeById() {
        //get the data of particular id
        Response response = given()
                .header("cookie", "humans_21909=1")
                .pathParam("id", 1)
                .when()
                .get("/employee/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
