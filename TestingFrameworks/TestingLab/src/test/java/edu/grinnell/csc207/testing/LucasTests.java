package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class LucasTests {
    @Test
	public void LucasTest1() {
		int n = 0;
		assertEquals(2, Functions.lucas(n));
	}
	
	@Test
	public void LucasTest2() {
		int n = 1;
		assertEquals(1, Functions.lucas(n));
	}

	@Test
	public void LucasTest3() {
		int n = 4;
		assertEquals(7, Functions.lucas(n));
	}
}
