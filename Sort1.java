package com.deloitte;

public class Sort1 {
	public static void main(String[] args) 
	{
		int []nums= {10,2,5,11,7,6,8};
         int n=nums.length;
         for(int i=0;i<n-1;i++) {
        	 for(int j=i+1;j<n;j++)
        	 {
        		 if(nums[i]>nums[j]) {
        			 int temp=nums[i];
        			 nums[i]=nums[j];
        			 nums[j]=temp;
        		 }
        	 }
         }
         System.out.println("After sorting:");
         for(int i:nums) {
        	 System.out.print(i+"\t");
         }
         }
}
