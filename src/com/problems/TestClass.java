package com.problems;

import java.util.Scanner;

public class TestClass {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(" Please enter the first string: ");
		String one = scan.next();
		
		System.out.print(" Please enter the second string: ");
		String two = scan.next();
		
		AnagramDetection obj = new AnagramDetection();
		obj.anagram(one, two);
	}

}
