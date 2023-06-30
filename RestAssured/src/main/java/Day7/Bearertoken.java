package Day7;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Bearertoken {
	String Btoken="";
	@Test
	public void m1()
	{
		given()
		.headers("Authorization","Bearer"+Btoken)
		
		.when()
		
		.get("")
		
	    .then()
	    .log().all();
		
		
	}

}
