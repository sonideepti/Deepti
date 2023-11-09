package com.orangehrm.methods;

public class NStaticMethod1
{
	//non-static method with return type with parameters
	public int add(int a,int b)
	{
		int sum=a+b;
		//System.out.println("inside method");
		return sum;
	}
	public static void main(String[]args)
	{
		//create an object to call non static method
		//syntax:  classname objrefvariable=new classname();
		NStaticMethod1 ns=new NStaticMethod1();
		
		//to call method with method name
		ns.add(20, 30); //it won't return a value
		
		//so for return a value, we have to store the method in variable
		int res=ns.add(20, 30);
		System.out.println(res);
		
		//we can also called a method by System.out.println()
		System.out.println(ns.add(20, 40));
	}
}
	

