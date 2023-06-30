package Day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HttpRequest {
	
	@Test(priority = 1)
	public void getData()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(201)
		.body("page",equalTo(2))
		.log().all()
		;
		
		
		
	}

}