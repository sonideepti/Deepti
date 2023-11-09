package com.orangehrm.java;

public class Sum
{
    //variables
	int i=5;
	
	//methods
	public void add()
	{
		int a=5;
		int b=7;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		// object
		
		Sum v=new Sum(); //object syntax:classname obj-ref=new classname()
		v.add();      //calling method/function
        System.out.print(v.i);
	}

}
