package com.deloitte;
interface Inter2{
	int sum(int i,int j);
	default void show() {System.out.println("Showing")
;}	
}

public class LambdaEx {

	public static void main(String[] args) {
		
    Inter2 i1=(i,j)->{System.out.println("Adding...");
                     return i+j;};
    System.out.println(i1.sum(5,6));
    i1.show();
	}

}
