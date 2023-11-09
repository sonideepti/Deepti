package com.orangehrm.methods;

public class StaticMethod4 {
  //4.Static method without return type without parameters
	
	public static void add()
	{
		int a=55;
		int b=45;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		StaticMethod4.add();	
	}
}
