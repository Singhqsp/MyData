package Day8;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
//import com.google.gson.JsonObject;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class CreateData {
	
@Test
public void ceatedata()
{
	Faker f = new Faker();
	JSONObject  data= new JSONObject();
	data.put("name", f.name().firstName());
	data.put("gender","male");
	data.put("email",f.internet().emailAddress());
	data.put("Account", "inactive");
	String bearer ="";
	int d= given()  //d will store the created id
	 .header("Authorization","Bearer"+ bearer)
	 .contentType("appliaction/json")
	 .body(data)
	 .when()
	 .get("URL")
	 .jsonPath().getInt("id");
	 
	 
	 
	 
	
	
	
	
}

}
