package com.polymorphismEx;

public class A {
	
	void m1() {
		System.out.println(123);
	}
	void m1(int d) {
		System.out.println(d+123);
	}
	public A() {
		System.out.println("I am non para-constructor");

	}
	public A(String na) {
		System.out.println("I am para constructor" + na);
	}
}
