package Day7;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class BasicAuthclass {
	
	@Test
	public void m1()
	{
		given()
		.auth().basic("postman","password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}
	
	@Test
	public void m2()
	{
		given()
		.auth().digest("postman","password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}
	
	@Test
	public void m3()
	{
		given()
		.auth().preemptive().basic("postman","password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}

}
