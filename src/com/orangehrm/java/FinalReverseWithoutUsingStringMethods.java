package com.orangehrm.java;

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args)
	{
		/*String str = "Automation";
		*
		*StringBuilder str2 = new StringBuilder();
		*
		*str2.append(str);
		*
		*str2 = str2.reverse();  //used string builder to reverse
		*
		*System.out.println(str2);
		
		 */
		String str = "Today is Rainy Day";
	        
		char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
	        
		for(int i= chars.length-1; i>=0; i--)
		{
	           
		System.out.print(chars[i]);
	        }
	}

}
