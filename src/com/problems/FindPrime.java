package com.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPrime {
	
	public ArrayList<Integer> primeValues = new ArrayList<>();
	
	public boolean anagramCheck(int first, int second) {
		
		String one = String.valueOf(first);
		String two = String.valueOf(second);		
		
		char newOne[] = one.toCharArray();
		char newTwo[] = two.toCharArray();
		
		Arrays.sort(newOne);
		Arrays.sort(newTwo);
		
		one = new String(newOne);
		two = new String(newTwo);
		
		if(one.equals(two))
			return true;

		return false;
	}
	
	public void anagram() {
		
		for (int i = 0; i < primeValues.size(); i++) {
			System.out.print(primeValues.get(i) + " ");
			for(int j = i + 1; j < primeValues.size(); j++) {
				if(anagramCheck(primeValues.get(i), primeValues.get(j))) {
					System.out.print(primeValues.get(j) + " ");
					primeValues.remove(primeValues.get(j));
				}
			}
			System.out.println();
		}
	}
	
	public boolean palindromeCheck(int n) {
		int rev = 0;
		int check = n;
		
		while(n > 0) {
			rev = rev*10 + n%10;
			n /= 10;
		}
		
		if (check == rev)
			return true;

		return false;
	}

	public boolean checkPrime(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public void prime() {
		for(int i = 2; i < 1000; i++) {
			if(checkPrime(i)) {
				System.out.print(i);
				primeValues.add(i);
				if (palindromeCheck(i))
					System.out.print("(p) ");
				System.out.println();
			}
		}
	}
}
