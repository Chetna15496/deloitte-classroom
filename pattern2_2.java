package com.deloitte;

import java.util.Scanner;

public class pattern2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
