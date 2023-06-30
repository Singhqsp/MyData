package Day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;


public class fetchingMultipleData {
	
	@Test
	public void m1()
	{
		Response res = given()
				       .when()
				       .get("http://restapi.adequateshop.com/api/Traveler");
				       
		
		XmlPath obj = new XmlPath(res.asString());
		
	  List<Object> trav = obj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
	  System.out.println(trav.size());
		
	  System.out.println("--------------------------------------------------------------------------");
	  
	  List<Object> trav1 = obj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
	  for(Object i:trav1)
	  {
		  System.out.println(i.toString());//Using this we can varify also
	  }
	  
		
		
		 
	}

}
