package com.deloitte;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class CollectionDemo {

	public static void main(String[] args) {
		Collection items=new ArrayList();
		items.add("Chanyeol");
		items.add(28);
		items.add(true);
		items.add(20.4);
		
		for(Object item:items)
		{
			System.out.println(item);
		}
		items.remove(20.4);
		System.out.println("After Removing");
		for(Object item:items)
		{
			System.out.println(item);
		}
		System.out.println("Size= "+items.size());
		
		List items1=new ArrayList();
		items1.add("Chanyeol");
		items1.add(28);
		items1.add(true);
		items1.add(20.4);
		items1.add(2,"Rahul");
		
		for(Object item:items1)
		{
			System.out.println(item);
		}
		//Iterator it= items.iterator();
		//while(it.hasNext()) {
			//System.out.println(it.next());
		//}
		//for(int i=0;i<items.size();i++)
		//{
		//	System.out.println((items.get(i));
		//}
		//items.forEach((item)-> System.out.println(item))
		//;
		items.forEach(System.out::println);
		System.out.println("Size= "+items.size());
	}

}
