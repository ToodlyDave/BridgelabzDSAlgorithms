package com.problems;

public class FindPrime {

	public boolean checkPrime(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public void prime() {
		for(int i = 2; i < 1000; i++) {
			if(checkPrime(i))
				System.out.println(i);
		}
	}
}
