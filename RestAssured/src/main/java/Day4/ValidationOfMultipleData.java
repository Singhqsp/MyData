package Day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class ValidationOfMultipleData {
	
	@Test
	public void variableValidation()
	{
		Response res= given()
				         .contentType("application-json")
				         .when()
				           .get("http://localhost:3000/store");
		      
		  String data= res.jsonPath().get("book[2].title").toString(); 
		  
		  Assert.assertEquals(res.getStatusCode(),200);
		  
		  Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		
		  Assert.assertEquals(data,"Sayings of friction");
		
	}

}
