package com.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplacement {
	
	private final String NAME = "<<name>>";
	private final String FULL_NAME = "<<full name>>";
	private final String PHONE_NUMBER = "(?<=91-)x{10}";
	private final String DATE = "(\\d{2}/){2}\\d{4}";

	public void replaceString() {
		String lineInFile = "";
		Pattern firstName = Pattern.compile(NAME);
		Pattern fullName = Pattern.compile(FULL_NAME);
		Pattern phoneNumber = Pattern.compile(PHONE_NUMBER);
		Pattern datePattern = Pattern.compile(DATE);
		
		try {
			Scanner scan = new Scanner(new File("src/com/problems/input.txt"));
			lineInFile = scan.nextLine();
			
			Matcher firstNameMatcher = firstName.matcher(lineInFile);
			lineInFile =  firstNameMatcher.replaceAll("David");

			Matcher fullNameMatcher = fullName.matcher(lineInFile);
			lineInFile =  fullNameMatcher.replaceAll("David Alapat");
			
			Matcher phoneNumberMatcher = phoneNumber.matcher(lineInFile);
			lineInFile =  phoneNumberMatcher.replaceAll("1234567890");

			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime date = LocalDateTime.now();
			Matcher dateMatcher = datePattern.matcher(lineInFile);
			lineInFile =  dateMatcher.replaceAll(dateFormat.format(date));
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" File not found");
		}
		
		System.out.println(lineInFile);
	}
}
