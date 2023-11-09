package com.orangehrm.java;

public class ReversesString {

	public static void main(String[] args) {
		// Logic-1: Using +(String concatenation) Operator
		
		String str="Deepti";
		String rev="";
		
		int len=str.length();  //6
		for (int i=len-1; i>=0; i--)  //5 4 3 2 1 0
		{
			rev = rev+str.charAt(i);  //itpeeD
		}
		
		
		//Logic-2: Using Character Array
		
		/*char a[]=str.toCharArray();
		 for(int i=a.length-1;i>=0;i--)
		 {
			 rev=rev+a[i];
		 }
		System.out.println("Reverse String is: " +rev);*/
		
		
		//Logic-3: Using String Buffer class
		
		/*StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());*/

	}

}
