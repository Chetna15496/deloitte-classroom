package com.deloitte;

public class StrAssignment {

	public static void main(String[] args) {
		String []emailid= {"chetna1m@gmail.com","abc@gmail.com","def@hotmail.com","dear@outlook.com","justit@gmail","love@hotmail.com","home@gmail.com","me@outlook.com","true@yahoo.com","yess@hotmail.com","iii@rediffmail.com","jeko@rediffmail.com"};
		System.out.println("Gmail:-");
		for(int i=0;i<emailid.length;i++)
		{
			
	     if(emailid[i].contains("@gmail"))
			{
				System.out.println(emailid[i]);
			}
		}
		System.out.println("Yahoo:-");
		for(int i=0;i<emailid.length;i++)
		{
			
			if(emailid[i].contains("@yahoo"))
			{
				System.out.println(emailid[i]);
			}
		}
		System.out.println("outlook:-");
		for(int i=0;i<emailid.length;i++)
		{
			
			if(emailid[i].contains("@outlook"))
			{
				System.out.println(emailid[i]);
			}
		}
		System.out.println("Hotmail:-");
		for(int i=0;i<emailid.length;i++)
		{
			
			if(emailid[i].contains("@hotmail"))
			{
				System.out.println(emailid[i]);
			}
		}
		System.out.println("Others:-");
		for(int i=0;i<emailid.length;i++)
		{
			
			if(!( emailid[i].contains("@gmail")||emailid[i].contains("@yahoo")||emailid[i].contains("@hotmail")||emailid[i].contains("@outlook")))
			{
				System.out.println(emailid[i]);
			}
		}
	}

}
