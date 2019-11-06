
package fr.runadium.premier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class CheckIfPremierTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void isPremierTest() {
		int input = 5;
		assertEquals(true, Number.isPremier(input));
	}
	
	@Test
	public void isNotPremierTest() {
		int input = 4;
		assertEquals(false, Number.isPremier(input));
	}
	
	@Test
	public void oneIsNotPremierTest() {
		int input = 1;
		assertEquals(false, Number.isPremier(input));
	}
	
	@Test
	public void zeroIsNotPremierTest() {
		int input = 0;
		assertEquals(false, Number.isPremier(input));
	}
	
	@Test
	public void negativeInputThrown() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negative number!!");
		Number.isPremier(-5);

	}

}
