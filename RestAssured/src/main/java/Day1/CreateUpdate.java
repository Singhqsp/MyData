package Day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class CreateUpdate {
	int id;
	@Test(priority = 1)
	public void m1()
	{
		HashMap hs = new HashMap();
		hs.put("name","pavan");
		hs.put("job","trainer");
		
	   id=given()
		.contentType("application/json")
		.body(hs)
		
		.when()
		 .post("https://reqres.in/api/users")
		 .jsonPath().getInt("id")
		
		;
		
		
	}




@Test(priority = 2)
public void m2()
{
	HashMap hs = new HashMap();
	hs.put("name","Kalyan");
	hs.put("job","trainerss");
	
	given()
	.contentType("application/json")
	.body(hs)
	
    .when()
     .put("https://reqres.in/api/users/"+id)
     
     .then()
     .statusCode(200)
     .log().all();
	 
	
	
	
	


}

}