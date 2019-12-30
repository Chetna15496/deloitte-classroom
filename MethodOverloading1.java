package com.deloitte;

public class MethodOverloading1 
{
  int add(int d,int e)
  {
	  return d+e;
  }
  float add(float a,float b)
  {
	  return a+b;
  }
  int add(int e,int f,int g) {
	  return e+f+g;
  }
	public static void main(String[] args) {
		
    MethodOverloading1 m=new MethodOverloading1();
   int sum1= m.add(4,5);
   System.out.println("Sum="+sum1);
   float sum2=m.add(6.6f,3.4f);
   System.out.println("Sum="+sum2);
   
   int sum3= m.add(4,6,7);
   System.out.println("Sum="+sum3);
   
    
	}

}
