package com.deloitte;
import java.util.Scanner;

public class ControlStrcSwitch {

	public static void main(String[] args) {
    int option;
    float amount;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter choice:\n1->INR->USD\n2->USD->INR");
    
    option=sc.nextInt();
     
    switch(option)
    {
    case 1:{ System.out.println("Enter the amount(Rs):");
            amount= sc.nextFloat();
            System.out.println("Total=$ "+amount/71);
            break;}
    
    
    case 2: {System.out.println("Enter the amount($):");
    	  amount= sc.nextFloat();
    	  System.out.println("Total=Rs"+amount*71);
          break;}
    
    
    	default:{System.out.println("Invalid choice");
                break;}                                                                           

	}
	}

}
