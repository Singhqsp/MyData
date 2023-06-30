package CreateUser;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UsingHashMap {
	@Test
	void testPostUsingHashMap()
	{
		HashMap data = new HashMap();
		
		data.put("name","Star");
		data.put("location","France");
		data.put("phone","123445");
		String courcesArr[]= {"C","C++"};
		
		data.put("Cources", courcesArr);
		
	    given().contentType("application/json")
	    .body(data);
	    
	    
	     
		
		
	}

}
