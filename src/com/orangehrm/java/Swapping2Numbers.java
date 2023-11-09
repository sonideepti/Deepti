package com.orangehrm.java;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10 , b=20;
		 System.out.println("Before swapping values are: "+a+" "+b);
		 
		 //Logic 1- third Variable
		/* int t=a; //10
		     a=b; //20
		     b=t; //10
		 System.out.println("After swapping values are: "+a+" "+b);*/
		 
		 //Logic 2- use + and -,without using third variable
		/* a=a+b;   //10+20=30
		 b=a-b;   //30-20=10
		 a=a-b;   //30-10=20 */
		 
		 //Logic 3- use * and / without using third variable & a and b values should not be Zero
		 /*a=a*b;  //10*20=200
		 b=a/b;  //200/20=10
		 a=a/b;  //200/10=20 */
		 
		 //Logic-4 Bitwise xor(^) operator use
		/* a=a^b;  //1010 xor 10100=11110=30
		 b=a^b;  //11110 xor 10100=1010
		 a=a^b; */
		 
		 //Logic-5 single statement
		 b=(a+b)-(a=b);    //execution starts from <------ right to left
		 
		 System.out.println("After swapping values are: "+a+" "+b);
	}

}
