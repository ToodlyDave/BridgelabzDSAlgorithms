package com.problems;

public class BubbleSort {

	public <T extends Comparable<T>> T[] sort(T [] array) {
		T temp;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		return array;
	}
}
