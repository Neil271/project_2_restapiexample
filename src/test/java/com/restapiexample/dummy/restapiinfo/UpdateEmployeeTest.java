package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployeeTest extends TestBase {

    @Test
    public void updateEmployeeById(){
        EmployeePojo employeePojo=new EmployeePojo();
        employeePojo.setEmployee_name("gotu");
        employeePojo.setEmployee_salary("40000");
        employeePojo.setEmployee_age("40");
        employeePojo.setProfile_image(" ");

        Response response=given()
                .header("Content-Type","application/json")
                .header("cookie","humans_21909=1")
                .pathParam("id",1364)
                .when()
                .body(employeePojo)
                .put("/update/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
