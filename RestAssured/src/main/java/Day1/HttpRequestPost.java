package Day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class HttpRequestPost {
	
	@Test
	public void m1()
	{
		HashMap hs = new HashMap();
		hs.put("name","pavan");
		hs.put("job","trainer");
		
		given()
		.contentType("application/json")
		.body(hs)
		.when()
		 .post("https://reqres.in/api/users")
		 
		 
		 .then()
		 
		 .statusCode(201)
		 .log().all();
		
		
		
		
		
	}
}
