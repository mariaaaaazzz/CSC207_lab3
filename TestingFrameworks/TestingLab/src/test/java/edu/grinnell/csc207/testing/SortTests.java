package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class SortTests {
    @Test
	public void SortTest1() {
		int[] arr = { 3, 8, 4, 7, 2 };
        Functions.sort(arr);
		assertEquals(2, arr[0]);
	}
    @Test
    public void SortTest2() {
		int[] arr = { 3, 8, 4, 7, 2 };
        Functions.sort(arr);
		assertEquals(4, arr[2]);
	}
    @Test
    public void SortTest3() {
		int[] arr = { 3, 8, 4, 7, 2 };
        Functions.sort(arr);
		assertEquals(8, arr[4]);
	}
}
