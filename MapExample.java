package com.deloitte;
import java.util.*;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
	Map<String,String> trainees= new HashMap<>();
	trainees.put("Chetna","Odisha");
	trainees.put("Parul","Odisha");
	trainees.put("Nishitha","Hyd");
	trainees.put("Teju","Hyd");
	trainees.put("Deepti","Vizag");
	//System.out.println(trainees.get("Chetna"));
	//System.out.println(trainees.get("Teju"));
	
	//System.out.println("Enter a name: ");
	//String name = new Scanner(System.in).nextLine();
	//System.out.println("Location: "+trainees.get(name));
   //for(String key:trainees.keySet()) {
    //	System.out.println("Name :"+key+"\tLocation: "+trainees.get(key));//follows hashcode so sorted in that way
    trainees.forEach((k,v)->System.out.println("Name: "+k+"\tLocation:"+v));
	}
	}


