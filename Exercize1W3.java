package com.coderscamps.week2;

import java.util.Scanner;

public class Week2Example {
	
	public static void main (String[] args) {
	    Integer userTotal; 
	    Scanner s = new Scanner(System.in); 
	    System.out.println("Type a number between 50 and 300: ");
	    String userInput = s.nextLine(); 
	    userTotal = inputUser(userInput); 
			
	    if (userTotal == null) {
	    	System.out.println("The number you typed in was: " + null); 
	    } else {
	    	System.out.println("The number you typed in was: " + userInput); 
	    }
	    s.close();
	  }
		
	  public static Integer inputUser(String myInput) {
	    Integer finalResults = Integer.parseInt(myInput); 
	    int runningInt = finalResults.intValue(); 
			
	    if ((runningInt < 50) || (runningInt > 300)) {
	    	finalResults = null;
	    }	
	    return finalResults; 
	  }
}