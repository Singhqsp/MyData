package Day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

//import com.google.gson.JsonObject;

//import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FetchAllTitle {
	
	@Test
	public void fetchdataFromObject()
	{
		Response res= given()
		 .contentType(ContentType.JSON)
		 
		 .when()
		   .get("http://localhost:3000/store");
		
		JSONObject obj = new JSONObject(res.asString());
		  for(int i=0;i<obj.getJSONArray("book").length();i++) { 
			
			  {
				  String data= obj.getJSONArray("book").getJSONObject(i).get("title").toString();
						  System.out.println(data); }
						 
			  }
				  
		  }
			 
		 
		
		
		
		
		
		
		
		
		
		
		  


}
