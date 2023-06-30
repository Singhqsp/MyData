package Day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class multipleCookie {
	
	@Test
	public void mulCooki()
	{
	  Response res=	given()
			  .when()
			  .get("https://www.facebook.com/");
	      
	     Map<String,String> data= res.getCookies();
	     
	     System.out.println(data.keySet());
	     
	     for(String i:data.keySet())
	     {
	    	 System.out.println(res.getCookie(i));
	     }
	     
	     
	     
	     
	     
	     
	     
			  
			  

	}

}
