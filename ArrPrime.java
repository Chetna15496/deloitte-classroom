package com.deloitte;
import java.util.Scanner;
public class ArrPrime {

	public static void main(String[] args) 
	{
		int []nums= {2 ,4,6,7,8};
		for(int i:nums)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime nos are:"+i);
			}
		}
		
		
	}

}
