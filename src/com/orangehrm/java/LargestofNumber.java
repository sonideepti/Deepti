package com.orangehrm.java;

//import java.util.Scanner;

public class LargestofNumber {

	public static void main(String[] args)
	{
		int a=10, b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println(a+ " is the largest number");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+ " is the largest number");
		}
		else
		{
			System.out.println(c+ " is the largest number");
		}
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt(); */


		/*if (a>b && a>c)
		{
			System.out.println(a+ " is the largest number");
		}
		
		else if (b>a && b>c)
		{
			System.out.println(b+ " is the largest number");
		}
		
		else
		{
			System.out.println(c+ " is the largest number");
		}*/
		
		
		//Ternary Operator
		
		//int Largest=a>b?a:b;
		//Largest=c>Largest?c:Largest;
		
		/*int Largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(Largest+" is the largest number");
		
*/
	}

}
