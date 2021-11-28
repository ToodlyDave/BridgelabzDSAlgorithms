package com.problems;

import java.lang.reflect.Array;

public class MergeSort {
	
	public <T extends Comparable<T>> T[] sort(T [] array, int low, int high) {
		
		if(high - low < 1) 
			return array;
		
		int mid = (high + low) / 2;	
		
		sort(array, low, mid);
		sort(array, mid + 1, high);
		
		return merge(array, low, mid, high);
	}
	
	public <T extends Comparable<T>> T[] merge(T [] array, int low, int mid, int high) {
		
		@SuppressWarnings("unchecked")
		T[] first = (T[]) Array.newInstance(array[0].getClass(), mid - low  + 1);
		@SuppressWarnings("unchecked")
		T[] second = (T[]) Array.newInstance(array[0].getClass(), high - mid);
		for(int i = 0; i < mid - low + 1; i++) 
			first[i] = array[low + i];
		for(int i = 0; i < high - mid; i++) 
			second[i] = array[mid + i + 1];
		
		int k = low, i = 0, j = 0;
		
		while (i < first.length && j < second.length) {
			if(first[i].compareTo(second[j]) < 0) 
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
