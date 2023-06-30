package Day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class HeadersValidate {
	
	@Test
	public void m1()
	{
		        	given()
				  .when()
				  .get("https://www.facebook.com/")
				  
				  .then()
				  .header("Content-Type","text/html; charset=\"utf-8\"")
				  .and()
				  .header("Content-Encoding","gzip")
				  .log().all();
				  ;
				  
				  
				  ;
		     
		          
		
		    
	}

}
