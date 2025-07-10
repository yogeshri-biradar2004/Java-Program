 package com.java.Inheritance;

class A {
	public void c1() {
		System.out.println("Parent method");
	}
}

class B extends A{
	public void c2() {
		System.out.println("Child method");
	}
}

public class Child{
	public static void main(String[] args) {
		B b = new B();
		b.c2();
		b.c1();
	
	}
}

//output
// Child method
// Parent method
