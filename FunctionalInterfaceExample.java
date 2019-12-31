package com.deloitte;
import java.util.*;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
	
		List<Integer>leap=Arrays.asList(2010,2016,1996,1990,2012);
		leap.stream().filter(i->(i%4==0)||(i%100==0 && i%400==0)).forEach(i->System.out.println("Leap year:"+i));
		
	}

}
