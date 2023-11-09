package com.orangehrm.methods;

public class StaticMethod3 {
	//3.Static method without return type with parameters
	
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		StaticMethod3.add(6, 5);
	}

}
