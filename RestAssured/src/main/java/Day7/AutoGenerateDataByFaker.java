package Day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class AutoGenerateDataByFaker {
	
	@Test
	public void m1()
	{
		Faker r = new Faker();
		
		System.out.println("Full Name"+r.name().firstName());
		
		System.out.println("Full Name"+r.name().lastName());
		
		System.out.println("Full Name"+r.name().fullName());
		
		System.out.println("Full Name"+r.color().hex());
		
		System.out.println("Full Name"+r.date().birthday());
		
		
		
		
		
		
	}

}
