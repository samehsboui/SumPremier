package fr.runadium.premier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


public class PremierTest {

	 @Test
	    public void isPremierTest() {
	        Premier number=new Premier();
	        int input=5;
	        assertEquals(true, number.isPremier(input)); 
	    }
	 
	 @Test
	    public void sumPremierTest() {
	        SumPremier number=new SumPremier();
	        int input=4;
	        assertEquals(17, number.sumPremier(input)); 
	    }
	 
	 @Rule
		public ExpectedException expectedException = ExpectedException.none();
	 
	 
	 @Test
		public void negativeInputThrown() {
			expectedException.expect(IllegalArgumentException.class);
			expectedException.expectMessage("negative number !!");
			SumPremier sum=new SumPremier();
		    sum.sumPremier(-5);

		}

	 
	
	
}
