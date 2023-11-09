package com.orangehrm.java;

public class CountCharactersInaString {

	public static void main(String[] args)
	{
	String s="Today is Ganesh Chaturthi";
	
	int count=0;
	
	System.out.println("Length of the string is "+s.length());
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) !=' ')
		{
			count++;
		}
	}

     System.out.println("Count of Characters "+count);
	}

}
