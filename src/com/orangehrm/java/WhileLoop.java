package com.orangehrm.java;

public class WhileLoop {

	public static void main(String[] args)
	{
		// Thiss loop can be used for executing statements multiple times ,when we don't know the iteration.
		//Syntax:
		
		//while(condition)
		//{
		    // statements
	   //}
	/*int i=1;
       while(i<=20)
       {
    	   System.out.print("selenium"+ " ");
    	   i++;
       }*/
		
		int i=1;
		
		while(i<=100)
		{
			if (i%2==0)
			{
				System.out.println(i);
				
			}
			i++;
		}
	}

}
