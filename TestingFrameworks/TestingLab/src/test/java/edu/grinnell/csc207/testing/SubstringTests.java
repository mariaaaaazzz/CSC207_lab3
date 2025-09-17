package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class SubstringTests {
    @Test
	public void exampleUnitTest() {
		int[] arr = { 3, 8, 4, 7, 2 };
		assertEquals(4, Functions.thirdGreatest(arr));
	}
	
	@Test
	public void UnitTest2() {
		int[] arr = { 2, 9, 4 };
		assertEquals(2, Functions.thirdGreatest(arr));
	}

	@Test
	public void UnitTest3() {
		int[] arr = { 22, 33, 33, 34 };
		assertEquals(22, Functions.thirdGreatest(arr));
	}
}
