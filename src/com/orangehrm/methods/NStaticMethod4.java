package com.orangehrm.methods;

public class NStaticMethod4 {
	//4.Non static method without return type without parameters
	public void add()
	{
		int a=5;
		int b=7;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		//create an object to call a non static method 
		NStaticMethod4 ns=new NStaticMethod4();
		 // to call a method
		ns.add();
	}

}
