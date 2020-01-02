package com.deloitte;
import java.io.*;

public class FileOperationDemo1 
{
	public static void main(String []args)
	{
		
	try {
		File file=new File("hello.txt");
		//FileInputStream fin=new FileInputStream(file);//byte stream
		FileReader fin=new FileReader(file);//Character stream
		int c;
		while((c=fin.read())!=-1) {
			System.out.print((char)c);// c gives ascii values so we typecast to character
		}
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
}
}
