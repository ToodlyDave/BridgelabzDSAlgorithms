package com.problems;

import java.util.Arrays;

public class AnagramDetection {

	public void anagram(String one, String two) {
		char newOne[] = one.toCharArray();
		char newTwo[] = two.toCharArray();
		
		Arrays.sort(newOne);
		Arrays.sort(newTwo);
		
		one = new String(newOne);
		two = new String(newTwo);
		
		System.out.println(" String one: " + one);
		System.out.println(" String two: " + two);
		
		if(one.equals(two))
			System.out.println(" They are anagrams");
		else
			System.out.println(" They are not anagrams");
		
	}
}
