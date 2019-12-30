package com.deloitte;
interface Operation{
	double operate(double a,double b);
}
class Calculation{
	double calculate(double i,double j,Operation op) {
		return op.operate(i, j);
	}
}

public class LambdaExpr2 {

	public static void main(String[] args) {
		Calculation cal =new Calculation();
		double a=5.5, b=3.3;
		double sum=cal.calculate(a,b,(x,y)->x+y);
		double mult=cal.calculate(a,b,(x,y)->x*y);
		System.out.println("Sum is:"+sum+   "\nProduct is:"+mult);
	}

}
