package com.problems;

public class InsertionSort {

	public int[] sort(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int index = i - 1;
			while(index >= 0 && array[index] > temp) {
				array[index + 1] = array[index];
				index--;
			}
			
			array[index + 1] = temp;
			
		}
		
		
		return array;
	}
}
