package com.orangehrm.methods;

public class StaticMethod1 {
	//1.Static method with return type with parameters
	public static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[]args)
	{
		//to call a static method
		//syntax: classname.methodname
		int res=StaticMethod1.add(20,10);
		System.out.println(res);
		System.out.println(StaticMethod1.add(10,10));
	}

}
