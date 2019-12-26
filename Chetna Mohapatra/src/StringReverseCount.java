
import java.util.Scanner;

public class StringReverseCount
{
 public static void main(String[] args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a string");
     String str= sc.nextLine();
    
     StringBuilder revStr=new StringBuilder(str);
     
     int count=0;
     char c;
     int n=str.length();
     for(int i=0;i<n;i++)
     {
    	 c=str.charAt(i);
    	 if(c=='A'|| c=='E'||c=='O'||c=='I'|| c=='U'||c=='i'||c=='e'||c=='o'||c=='a'|| c=='u') {
    		 count++;
    	  
     }
     revStr.setCharAt(n-(i+1),c);
}
System.out.println("Total count: " +count);
System.out.println("Reverse: " +revStr);
}
}


   
       
