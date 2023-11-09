package com.orangehrm.methods;

public class NStaticMethod3 {
	//3.Non static method without return type with parameters
	
	public void add(int a,int b)
	{
		int sum=a+b;
		//to print the sum value without return type
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		//create object to call a non static method
		NStaticMethod3 ns=new NStaticMethod3();
		//to call a method without return type
		ns.add(8, 5); //call a method with methodname only
	}

}
