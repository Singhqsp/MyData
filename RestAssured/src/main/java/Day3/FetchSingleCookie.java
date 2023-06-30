package Day3;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class FetchSingleCookie {
	
	@Test
	public void m1()
	{
	   Response res =	given()
		.when()
		.get("https://www.facebook.com/");
		String data= res.getCookie("fr");
		
		System.out.println(data);
		
	}

}
