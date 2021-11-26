package com.problems;

import java.util.Scanner;

public class TestClass {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void display(int [] array) {
		for (int j : array) {
			System.out.print(" " + j);			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort merge = new MergeSort();
		int array[] = {40, 30, 70, 50, 22, 65};
		
		merge.sort(array, 0, array.length - 1);
		display(array);
	}

}
