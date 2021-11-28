package com.problems;

public class InsertionSort {

	public <T extends Comparable<T>> T[] sort(T [] array) {
		
		for (int i = 0; i < array.length; i++) {
			T temp = array[i];
			int index = i - 1;
			while(index >= 0 && array[index].compareTo(temp) > 0) {
				array[index + 1] = array[index];
				index--;
			}
			
			array[index + 1] = temp;			
		}		
		return array;
	}
}
