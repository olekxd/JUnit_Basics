package com.bartcoder.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraySortTestExceptions {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray(){
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayPrintTable_OutOfBound() {
		int[] numbers = {1 , 5 , 6};
		for (int i = 0; i < 4; i++) {
			numbers[i] = 1;
		}
	}
	
	@Test(timeout=1000)
	public void testSort_Performance() {
			int array[] = {10, 4 , 5};
		for (int i = 0; i < 100000000; i++) {
			array[0] = 1;
			Arrays.sort(array);
		}
	}

}
