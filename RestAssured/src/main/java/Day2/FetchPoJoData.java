package Day2;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class FetchPoJoData {
@Test	
  public void m1()
  {
	PojoClass data = new PojoClass();
	data.setName("RRRRR");
	data.setLocation("HYD");
	data.setPhone("213232");
	String[] x= {"java","Maths"};
	data.setCourses(x);
	
	
	
	given()
	.contentType("application/json")
	.body(data)

.when()
.post("http://localhost:3000/students")
.then()
 .statusCode(201)
 .body("name",equalTo("RRRRR"))
 .body("location",equalTo("HYD"))
 .body("phone",equalTo("213232"))
 .log().all();

  }
}
