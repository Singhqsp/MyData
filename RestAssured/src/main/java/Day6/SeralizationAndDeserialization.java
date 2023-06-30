package Day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Day2.PojoClass;

public class SeralizationAndDeserialization {
	
	@Test
	public void serialization() throws Throwable
	{
		PojoClass pc = new PojoClass();
		pc.setName("Star");
		pc.setLocation("HYD");
		pc.setPhone("121211");
		
		String[] str={"star","demo"};
		pc.setCourses(str);
		
		ObjectMapper obj = new ObjectMapper();
		
	 String data=	obj.writerWithDefaultPrettyPrinter().writeValueAsString(pc);
		
		System.out.println(data);
		
		
	}
	
	@Test
	public void JsonToPojoObject() throws Throwable, JsonProcessingException
	{
		String json="{\r\n"
				+ "  \"location\" : \"HYD\",\r\n"
				+ "  \"phone\" : \"121211\",\r\n"
				+ "  \"courses\" : [ \"star\", \"demo\" ],\r\n"
				+ "  \"name\" : \"Star\"\r\n"
				+ "}";
		ObjectMapper obj = new ObjectMapper();
		
	   PojoClass po=	obj.readValue(json,PojoClass.class);
		
		  System.out.println("----------------------------------------------");
		  System.out.println(po.getName()); System.out.println(po.getLocation());
		  System.out.println(po.getPhone()); //System.out.println(po.getClass());
		  //System.out.println(po.getCourses());
		 		
		
	}

}
