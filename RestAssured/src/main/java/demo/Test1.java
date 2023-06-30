package demo;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Test1 {
	
	@Test
	public void getUser()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200).body("page",equalTo(1)).
		log().all();
	}

}
