package com.deloitte;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter array size.");
		//int n=sc.nextInt();
		int []nums= {1,2,3,4,5};
		 for(int i=0;i<nums.length;i++)//for changing the data
		 {
			 System.out.print(nums[i]+"\t");
		 }
		 for(int i:nums) {
			 System.out.print(i+"\t");//for fetching the data
		 }
	}
	
}
