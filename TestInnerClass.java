package com.deloitte;

class Outer{
	void outerMethod()
	{
		System.out.println("From Outer");
	}

static class Inner{
	void innerMethod() {
		System.out.println("From Inner");
	}
}
}
public class TestInnerClass {

	public static void main(String[] args) {
			Outer  outerObj=new Outer();
			outerObj.outerMethod();
			//Outer.Inner innerObj= outerObj.new Inner();//if Inner is not static
			Outer.Inner innerObj= new Outer.Inner();
	        innerObj.innerMethod();	
	}

}
