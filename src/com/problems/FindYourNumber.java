package com.problems;

import java.util.Scanner;

public class FindYourNumber {

	public void find(int low, int high) {
		
		Scanner scan = new Scanner(System.in);
		int mid = (low + high) / 2;
		
		System.out.println(" 1. Greater than\n 2. Equal to\n 3. Less than");
		System.out.print(" Is your number " + mid + ": ");
		int ch = scan.nextInt();
		
		switch(ch) {
		case 1:
			if(high - mid == 1) {
				find(high, high);
				break;
			}
			find(mid, high);
			break;
		case 2: 
			System.out.println(" Woohoo");
			return;
		case 3:
			find(low, mid);
			break;
		default:
			System.out.println(" Please enter a valid input: ");
		}
	}
}
