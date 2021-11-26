package com.problems;

import java.util.Scanner;

public class TestClass {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int[] getArray() {
		System.out.print(" Please enter the size of the array: ");
		int n = scan.nextInt();
		
		int array[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print(" Please enter the " + (i + 1) + " value: ");
			array[i] = scan.nextInt();
		}
		
		return array;
	}
	
	public static void display(int [] array) {
		for (int j : array) {
			System.out.print(" " + j);			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort sort = new BubbleSort();
		int array[] = getArray();
		
		sort.sort(array);
		display(array);
	}

}
