package fr.runadium.premier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class CheckSumOfSequenceOfPremierTest {

	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void sumOfPremierIsCorrectTest() {
		int input = 2;
		assertEquals(5, SumOfPremier.SumOfPremierSequence(input));
	}
	
	@Test
	public void sumOfPremierIsIncorrectTest() {
		int input = 3;
		assertNotEquals(15, SumOfPremier.SumOfPremierSequence(input));
	}
	
	@Test
	public void sumOfZeroInputThrown() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Your sum is equal to zero!!");
		SumOfPremier.SumOfPremierSequence(0);
	}
	
	@Test
	public void sumOfNegativeInputThrown() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Negative Input!! you need to enter a positive one!");
		SumOfPremier.SumOfPremierSequence(-5);
	}
}

