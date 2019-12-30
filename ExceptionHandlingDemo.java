package com.deloitte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int a,b;
	System.out.println("Enter values for a & b");
	
	try {
	a=Integer.parseInt(in.readLine());
	b=Integer.parseInt(in.readLine());
	int x=a/b;
	
	System.out.println("Result is:"+x);}
	catch(ArithmeticException ae) {
		System.out.println("Error= "+ae.getMessage());
	}
	catch(IOException oe) {
		System.out.println("Error= "+oe.getMessage());
	}
	catch(NumberFormatException e)
	{
		System.out.println("Error= "+e.getMessage());
	}
	System.out.println("Done");
	
	}

}
