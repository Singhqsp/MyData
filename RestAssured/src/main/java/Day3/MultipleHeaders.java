package Day3;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

public class MultipleHeaders {
	
	@Test
	public void allHeaders()
	{
		Response res = given()
				         .when()
				           .get("https://www.google.com/");
		Headers hd = res.getHeaders();
		
		for(Header i:hd)
		{
			  System.out.println(i.getName()+"      "+i.getValue());
		}
		
		
		
		
	}

}
