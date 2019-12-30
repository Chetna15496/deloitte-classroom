package com.deloitte;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		Queue<String>items=new PriorityQueue<>();
		items.add("20");
		items.add("25");
		items.add("23");
		items.add("2");
		items.add("25");
		items.add("30");
		items.add("7");
		items.add("201");
		items.add("30");
		
		for(String item:items)
		{
			System.out.println(item);
		}

	}

}
