package com.problems;

public class BinarySearch {

	public <T extends Comparable<T>> void binarySearch(T[] array, int low, int high, T data) {

        int mid = (low + high) / 2;

        System.out.println(" ( " + low + " " + mid + " " + high + " )");
        if (data.equals(array[mid])) {
                System.out.println(" Found the word");
                return;
        }
        
        if (mid == low || mid == high) {
        	System.out.println(" We did not find the word ");
        	return;
        }

        else if (data.compareTo(array[mid]) > 0)
                binarySearch(array, mid, high, data);
        else
                binarySearch(array, low, mid, data);
}
}
