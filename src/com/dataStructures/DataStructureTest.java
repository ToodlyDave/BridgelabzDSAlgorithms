package com.dataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import unorderedList.UnorderedList;

public class DataStructureTest {

	public static void main(String[] args) {
		UnorderedList list = new UnorderedList();
		String str = "";
		try {
			Scanner scan = new Scanner(new File("src/input.txt") );
			str = scan.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String words : str.split(" ")) {
			list.insert(words);
		}
		list.display();
	}
}
