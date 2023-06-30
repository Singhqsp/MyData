package Day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FetchingDataWithResponse {
	
	//Approch 2 Validating the data with Responce
	@Test
	public void FetchData()
	{
		Response res = given()
				       .when()
				       .get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(),200);
		
		 String data= res.xmlPath().get("TravelerinformationResponse.page").toString();
		
		  //System.out.println(data);
		 
		    Assert.assertEquals(data,"1");
		 
		 
		 
		
	}


}
