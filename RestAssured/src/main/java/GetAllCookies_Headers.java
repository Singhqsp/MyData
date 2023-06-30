import org.testng.annotations.Test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAllCookies_Headers {
	
	@Test
	public void t1()
	{
		given()
		   .when()
		     .get("https://www.google.com/")
		     
		     .then()
		     
		     .log().cookies();
		     
	}

}
