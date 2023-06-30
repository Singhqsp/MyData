package Day7;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class OAuth1 {
	
	@Test
	public void m1()
	{
		given()
		.auth().oauth("Consumer key","ConsumerSecret","AcessToken","Token Secret");
		when()
		.get("url")
		.then()
		.log().all();
	}

}
