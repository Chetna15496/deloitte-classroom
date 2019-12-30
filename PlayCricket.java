package com.deloitte;

public class PlayCricket {

	public static void main(String[] args) {
		Bowler b1;//=new Bowler();
		//b1.bowl();
		//FastBowler f1=new FastBowler();
		//f1.bowl();
		b1=new FastBowler();
		b1.bowl();
		//b1.action();
		b1=new Spinner();
		b1.bowl();
		b1.run();
		

	}

}
