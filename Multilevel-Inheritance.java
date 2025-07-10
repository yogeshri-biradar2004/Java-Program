package com.java.Inheritance;

class A1{
	public void s1() {
		System.out.println("class a");
	}
}

class B1 extends A1{
	public void s2() {
		System.out.println("class b");
	}
}

class C1 extends B1{
	public void s3() {
		System.out.println("class c");
	}
}


public class Multilevel {

	public static void main(String[] args) {
		 C1 c = new C1();
		 c.s1();
		 c.s2();
		 c.s3();

	}

}

//output
// class a
// class b
// class c
