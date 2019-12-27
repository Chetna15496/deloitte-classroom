package com.deloitte;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int f=1;
	System.out.println("Enter a no:");
	int n= sc.nextInt();
	while(n>0) {
		f*=n;
		n--;
	}
	System.out.println("Factorial of no is:"+f);
	}

}
