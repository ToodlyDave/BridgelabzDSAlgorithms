package com.problems;

import java.util.Arrays;

public class TestClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"hi", "there", "these", "are", "random", "words", "in", "an", "array"};
		BinarySearch binary = new BinarySearch();
		Arrays.sort(array);
		
		binary.binarySearch(array, 0, array.length, "hi");
	}

}
