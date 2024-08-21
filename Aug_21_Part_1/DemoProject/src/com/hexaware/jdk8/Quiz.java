package com.hexaware.jdk8;

interface IOne {
	default void show() {
		System.out.println("Show Method from IOne...");
	}
}

interface ITwo {
	default void show() {
		System.out.println("Show Method from ITwo...");
	}
}

interface IThree {
	default void show() {
		System.out.println("Show Method from IThree...");
	}
}

class Demo implements IOne, ITwo, IThree {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
}
public class Quiz {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.show();
	}
}
