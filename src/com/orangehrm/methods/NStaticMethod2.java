package com.orangehrm.methods;

public class NStaticMethod2 {
	
	//2.Non static method with return type without parameters
	
	public int add()
	{
		int a=52;
		int b=8;
		int sum=a+b;
		return sum;
	}
	public static void main(String[]args)
	{
		//create an object
		NStaticMethod2 ns=new NStaticMethod2();
		int res=ns.add();
		System.out.println(res);
		System.out.println(ns.add());
	}

}
