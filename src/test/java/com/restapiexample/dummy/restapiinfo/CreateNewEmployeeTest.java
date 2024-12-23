package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateNewEmployeeTest extends TestBase {

    @Test
    public void createNewEmployee() {
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setEmployee_name("mahek");
        employeePojo.setEmployee_salary("40000");
        employeePojo.setEmployee_age("40");
        employeePojo.setProfile_image(" ");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .when()
                .body(employeePojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
