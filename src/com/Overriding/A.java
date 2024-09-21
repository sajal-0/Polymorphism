package com.Overriding;

public class A extends B {
	int a = 23;
	int num = 2345;
	// we cannot Override variables
	//we cannot Override Constructor
	
	@Override
	void m1() {
		System.out.println(444);
	}
//	@Override
//	static void m3() {
//		System.out.println("This is static method in child m3");
//	}
	@Override
	void marry() {
		System.out.println("Marry with Girly B");
	}

	
}
