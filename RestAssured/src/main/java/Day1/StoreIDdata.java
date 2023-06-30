package Day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class StoreIDdata {
	
	 int id;
	@Test
	public void fetch_Id()
	{
		HashMap hs = new HashMap();
		hs.put("name","pavan");
		hs.put("job","trainer");
		
	    	
		 id=given()
		 	.contentType("application/json")
		 	.body(hs)
		.when()
		
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		 
		 System.out.println(id);
		
		
		
		
		
		;
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
