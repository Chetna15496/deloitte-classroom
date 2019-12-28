package com.deloitte;
import java.util.Scanner;
public class JavaAssignmentWeek1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num= sc.nextInt();
	int sum=0;
	int rem;
	while(num>0)
	{
	  rem=num%10;
	  if(rem%2!=0)
	  {	
		sum=sum+rem;
	  }	
	 num=num/10;
	}
System.out.println("The sum of all odd digits in the number is:"+sum);
	}
}
