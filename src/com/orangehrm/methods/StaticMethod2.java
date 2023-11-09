package com.orangehrm.methods;

public class StaticMethod2 {
	//2.Static method with return type without parameters
	
	public static int add()
	{
		int a=9;
		int b=3;
		int sum=a+b;
		return sum;
	}
    public static void main(String[]args)
    {
    	int res=StaticMethod2.add();
    	System.out.println(res);
    	//System.out.println(StaticMethod2.add());
    }
}
