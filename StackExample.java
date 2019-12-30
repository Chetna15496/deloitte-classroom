package com.deloitte;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		Stack<String> items= new Stack<>();
		items.push("Chetna");
		items.push("Parul");
		items.push("Nishitha");
		items.push("Tejaswini");
		
		
		
		while(!items.isEmpty())
		{
			System.out.println(items.pop());
		}

	}

}
