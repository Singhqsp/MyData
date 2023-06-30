package Day6;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
//import com.jayway.restassured.module.jsv.JsonSchemaValidator;
//import io.restassured.module.jsv.JsonSchemaValidator;
import com.jayway.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaVal {
	
	@Test
	public void SchemaValidator()
	{
		given()
		.when()
		.get("http://localhost:3000/store")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemaValidation.json"));
  

	}
}
