package com.orangehrm.java;

public class FindEvenNumbers {

	public static void main(String[] args)
	{
		for(int i=2;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number: " +i);
			}else
			{
				System.out.println("Odd Number: " +i);
			}
		}

	}

}
