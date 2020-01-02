package com.deloitte;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
public class FileDemoNio {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		try {
			//Files.lines(Paths.get("hello.txt")).forEach(System.out::println);
	        //Files.list(Paths.get(".")).forEach(System.out::println);
	       // Files.lines(Paths.get("hello.txt")).filter(s->s.toString().endsWith(".txt")).forEach(System.out::println);
	       // Files.lines(Paths.get("hello.txt")).filter(s->s.toString().length()>15).forEach(System.out::println);
		     Files.lines(Paths.get("hello.txt"))
		     .filter(s->(s.toString()
		      .split(" ")).length>=3)
		     .map(String::toUpperCase);
		     
		     List<String> lines =Files.lines(Paths.get("hello.txt")).collect(Collectors.toList());
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
