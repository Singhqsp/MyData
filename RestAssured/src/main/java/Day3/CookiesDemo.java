package Day3;

import org.testng.annotations.Test;

import io.restassured.http.Cookie;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CookiesDemo {
	
	@Test
	void testCookies()
	{
		given()
		.when()
		.get("https://www.facebook.com/")
		.then()
		 .cookie("fr","0YkUzKv9BtCliKl43..BkGI0p.C4.AAA.0.0.BkGI2Y.AWWa9P0lePM")
		 .log().all();
		
	}

}
