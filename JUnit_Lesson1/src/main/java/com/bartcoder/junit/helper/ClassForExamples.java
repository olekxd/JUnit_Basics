package com.bartcoder.junit.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassForExamples {

	public static void main(String[] args) {
		String expectedOutputs[][] = {{"AACD", "CD"} , {"ACD", "CD"} };
		List<String[]> strings = Arrays.asList(expectedOutputs);;		
		

		List<String> example1 = new ArrayList<>();
		
		
		String[] arr = strings.get(1);
		
		
		
		
		
		System.out.println(arr[0].toString());
		
		
//		for(String[] str : strings) {
//			System.out.println(Arrays.toString(str));
//		}
	
	}

	

}
