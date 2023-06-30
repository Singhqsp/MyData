package Day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class FetchingWithoutResponsexml {
	
	//@Test
	public void xmlValidate()
	{
		             given()
				       // .contentType("application.xml")
				     .when()
				        .get("http://restapi.adequateshop.com/api/Traveler?page=1")
				     .then()
				     .statusCode(200)
				         .header("Content-Type","application/xml; charset=utf-8")
				         .body("TravelerinformationResponse.page",equalTo("1"))
		                 .body("TravelerinformationResponse.travelers.Travelerinformation[0].name",equalTo("Developer"));
				         
				       
				     
				     
				       
	}
	
	//Approch 2 Validating the data with Responce

}
