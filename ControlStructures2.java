package com.deloitte;

import java.util.Scanner;

public class ControlStructures2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int largest=(a>b?a :b);
		 largest=c>largest ? c:largest;
		System.out.println("Largest is="+largest);
		
	    sc.close();
	
	}
	
	
	
	

}
