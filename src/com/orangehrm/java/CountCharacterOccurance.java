package com.orangehrm.java;

public class CountCharacterOccurance {

	public static void main(String[] args) 
	{
		String s="today is Rainy Day";
		
		int a= s.length();
		
		int b= s.replace("a","").length();
		
		int count= a-b;
		
		System.out.println("Number of Occurances of a is: " +count);

	}

}
