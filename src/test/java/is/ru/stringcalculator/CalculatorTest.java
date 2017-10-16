package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultiplesNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testLineBetweenNumbers(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumbers() {
		assertEquals("Negatives not allowed: -1", Calculator.add("-1,2"));
	}

	@Test
 	public void testOverThousand()
 	{
 		assertEquals(2, Calculator.add("1005,2"));
 	}



}