package com.amazon.code.question.code_question;
import java.util.*;

public class TestQuestion {
	// global error messages
	public static char doesNotContain = Character.MAX_HIGH_SURROGATE;
	public static String doesNotContainErrMsg = "\nLinked list does not contain inputted character. Please try again and enter a valid character value.\n";
	public static char numIndicesTooLarge = Character.MAX_LOW_SURROGATE;
	public static String numIndicesTooLargeErrMsg = "\nNumber of indices to be added cannot be greater than the size of the linked list. Please try again and enter a valid index to add value.\n";
	public static char endOfList = Character.MAX_VALUE;
	public static String endOfListErrMsg = "\nNumber of indices to be added to the inputted character goes off the end of the linked list. Please try again and enter a valid index to add value.\n";
	public static char nullList = Character.MIN_VALUE;
	public static String nullListErrMsg = "\nList is null. Please try again with an initialized list.\n";
	
	
	public static void main(String[] args) {
		// variables
		List<Character> list = new LinkedList<Character>();
		char returnVal = Character.MIN_VALUE, listChar = 'a';
		Scanner read = new Scanner(System.in);
		String userInputChar = "default";
		int userInputNum = -1;
		
		// initialize list
		for(int i = 0; i < 26; i++, listChar++)
		{
			list.add(listChar);
		}
		
		System.out.println("Linked List is " + list + ".");
		while(returnVal == Character.MIN_VALUE || returnVal == Character.MAX_HIGH_SURROGATE || returnVal == Character.MAX_LOW_SURROGATE || returnVal == Character.MAX_VALUE) {
			// initialize
			userInputChar = "default";
			userInputNum = -1;
			
			// user input - character value
			while(userInputChar.length() > 1) {
				System.out.println("1.) Enter character value: ");
				userInputChar = read.nextLine();
				if(userInputChar.length() > 1) {
					System.out.println("\tEnter a single character: ");
				}
			}
			System.out.println("CHAR = " + userInputChar);
			// user input - indices value
			while(userInputNum < 0) {
				try {
					System.out.println("\n2.) Enter number of indices to add: ");
			    	userInputNum = read.nextInt();
				} 
				catch(InputMismatchException ex) {
					System.out.println("\tInput must be an integer.");
					read.nextLine();
				}
			}
			System.out.println("NUM = " + userInputNum);
			
			// calculate
			returnVal = returnCharPlusValue(list, userInputChar.charAt(0), userInputNum);
			read.nextLine();
		}
		System.out.println("The result of adding " + userInputNum + " indices to " + userInputChar.charAt(0) + " in the linked list is: " + returnVal);
	}
	
	
	
	// function - commenting out error messages for now...can uncomment to use the program
	public static char returnCharPlusValue(List<Character> list, char value, int numIndices) {
		// variables
		int locationOfVal = -1;
		
		// check null list
		if(list != null) {
			locationOfVal = list.indexOf(value);	
		}
		else {
			System.err.println(nullListErrMsg);
			return nullList;
		}
		
		// error cases
		if(!list.contains(value)) {
			System.err.println(doesNotContainErrMsg);
			return doesNotContain;
		}
		else if(numIndices >= list.size()) {
			System.err.println(numIndicesTooLargeErrMsg);
			return numIndicesTooLarge;
		}
		else if((locationOfVal + numIndices) >= list.size()) {
			System.err.println(endOfListErrMsg);
			return endOfList;
		}
		
		// find and return value
		return list.get(locationOfVal + numIndices);
	}
}
