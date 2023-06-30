package Day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ParsingJsonResponseData {
	
	@Test
	//Validation of single data
	public void validateResponse()
	{
		given()
		.contentType("application/json")
		.when()
		.get("http://localhost:3000/store")
		
	    .then()
	     .statusCode(200)
	     .header("Content-Type","application/json; charset=utf-8")
	     .body("book[1].title",equalTo("Sayings of Honour"));
	     
		
		
	}

}
