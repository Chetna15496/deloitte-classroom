package com.deloitte;
import java.util.Scanner;
public class ControlStructures
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
		System.out.println("A="+a);
			}
			else if(b>c)
			{
				System.out.println("B="+b);
			}
			else
			{
				System.out.println("C="+c);
			}
		}
		
		
	}


