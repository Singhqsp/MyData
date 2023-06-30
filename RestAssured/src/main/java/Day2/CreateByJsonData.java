package Day2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
public class CreateByJsonData {
	@Test
	public void m1()
	{
	JSONObject data = new JSONObject();
	data.put("name","RRR");
	data.put("Location","India");
	data.put("phone","1234455");
	String[] cources= {"java","API"};
	data.put("Cources",cources);
	
	 given()
	 .contentType("application/json")
	 .body(data.toString())
	 
	 .when()
	 .post("http://localhost:3000/students")
	 .then()
	  .statusCode(201)
	  .body("name",equalTo("RRR"))
	  .body("Location",equalTo("India"))
	  .body("phone",equalTo("1234455"))
	  .log().all()
	  ;
	
	}

}