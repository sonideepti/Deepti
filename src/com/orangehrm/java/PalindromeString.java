package com.orangehrm.java;

public class PalindromeString {

	public static void main(String[] args) {
		// A Palindrome string is a string that remains the same when its reversed.for example- MADAM
		String str="CANADA";
		String Org_str=str;
		String rev="";
	
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if (Org_str.equals(rev))
		{
			System.out.println(Org_str+" is Palindrome String");
		}
		else
		{
			System.out.println(Org_str+" is not Palindrome String");
		}
	}

}
