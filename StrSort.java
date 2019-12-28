package com.deloitte;
import java.io.BufferedReader;

public class StrSort {

	public static void main(String[] args) {
		String []names= {"Suho","Lay","Xiumin","Baekhyun","Chanyeol","DO","Kai","Sehun","Chen"};
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
		
		{
		 if(names[i].compareTo(names[j])>0)
		 {
			 String temp=names[i];
			 names[i]=names[j];
			 names[j]=temp;
		 }
		}
		}
		for(String name:names) {
			System.out.println(name);
		}

	}

}
