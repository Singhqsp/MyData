package Day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ValidatePerticularbook {
	
	@Test
	public void fetchdataFromObject()
	{
		Response res= given()
		 .contentType(ContentType.JSON)
		 
		 .when()
		   .get("http://localhost:3000/store");
		
		JSONObject obj = new JSONObject(res.asString());
		boolean status=false;  
		//Check weather book is present or not
		for(int i=0;i<obj.getJSONArray("book").length();i++) { 
			
			  
				  String data= obj.getJSONArray("book").getJSONObject(i).get("title").toString();
					if(data.equals("Sayings of ITI"))
					{
						status=true;
						break;
					}
			  }
			  
		Assert.assertEquals(status,true);
		double price=0.0;
		//Same way we can calculate the total price of books:
		for(int i=0;i<obj.getJSONArray("book").length();i++)
		{
			String data=obj.getJSONArray("book").getJSONObject(i).get("price").toString();
			
			 price=  Double.parseDouble(data) + price;
		}
			
		System.out.println("Price of book is"+price);
		
		
		  }
	

	
	
}
