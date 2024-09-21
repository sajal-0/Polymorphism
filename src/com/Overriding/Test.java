package com.Overriding;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m2();
		a1.m1();
		B obj1 = new A();
//		A obj2 = new B();
		
		obj1.m1();
		obj1.marry();
		
		
		
	}
}
