package Day7;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Oauth2 {
	@Test
	public void m1()
	{
		given()
		.auth().oauth2("acessToken");
		when()
		.get("url")
		.then()
		.log().all();
	}

}
