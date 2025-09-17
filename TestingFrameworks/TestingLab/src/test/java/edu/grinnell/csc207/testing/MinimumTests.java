package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumTests {
    @Test
	public void exampleUnitTest() {
		int[] arr = { 1,1,1,1,1 };
		assertEquals(1, Functions.Minimum(arr));
	}
	
	@Test
	public void UnitTest2() {
		int[] arr = { 6,4,2,1 };
		assertEquals(1, Functions.Minimum(arr));
	}

	@Test
	public void UnitTest4() {
		int[] arr = { 1,2,3,4,5,6,7,};
		assertEquals(1, Functions.Minimum(arr));
	}

    @Test
	public void UnitTest5() {
		int[] arr = {1};
		assertEquals(1, Functions.Minimum(arr));
	}

    @Test
	public void UnitTest3() {
		int[] arr = { -5,-3,7,8};
		assertEquals(-5, Functions.Minimum(arr));
	}
}
