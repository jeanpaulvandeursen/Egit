package org.vandeursen.junitsample;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;


public class MultiplierTest {


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		Multiplier tester = new Multiplier();
		tester.multiply(101, 1);
	}
	
	@Test
	public void testMultiply() {
		Multiplier tester = new Multiplier();
		assertEquals("10 x 5 should be 50", 50, tester.multiply(10, 5));
	}
	
}
