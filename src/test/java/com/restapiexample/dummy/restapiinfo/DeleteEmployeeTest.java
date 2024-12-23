package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployeeTest extends TestBase {

    @Test
    public void deleteEmployee() {
        given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("id", 1364)
                .when()
                .delete("/delete/{id}")
                .then().log().all()
                .statusCode(204);
    }
}
