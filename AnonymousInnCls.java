package com.deloitte;
interface Inter1{
	void show();
}

public class AnonymousInnCls {

	public static void main(String[] args) {
		Inter1 i1=()->System.out.println("Hi");
		i1.show();
		
	}

}
