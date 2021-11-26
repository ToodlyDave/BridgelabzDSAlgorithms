package com.problems;

public class MergeSort {
	
	public int[] sort(int [] array, int low, int high) {
		
		if(high - low < 1) 
			return array;
		
		int mid = (high + low) / 2;	
		
		sort(array, low, mid);
		sort(array, mid + 1, high);
		
		return merge(array, low, mid, high);
	}
	
	public int[] merge(int [] array, int low, int mid, int high) {
		
		int [] first = new int[mid - low + 1];
		int [] second = new int[high - mid];
		
		for(int i = 0; i < mid - low + 1; i++) 
			first[i] = array[low + i];
		for(int i = 0; i < high - mid; i++) 
			second[i] = array[mid + i + 1];
		
		int k = low, i = 0, j = 0;
		
		while (i < first.length && j < second.length) {
			if(first[i] < second[j]) 
				array[k++] = first[i++];
			else
				array[k++] = second[j++];
		}
		
		while( i < first.length)
			array[k++] = first[i++];
		while( j < second.length)
			array[k++] = second[j++];
		
		return array;
	}
}
