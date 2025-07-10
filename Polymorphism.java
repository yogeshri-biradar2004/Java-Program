package Polymorphism;

public class Polymorphism {
	public void m1() {
		System.out.println("no arg");
	}
	public void m1(int i) {
		System.out.println("number is:" +i);	
	}
	
	public void m1(int i,String s) {
		System.out.println("Int is:" +i);
		System.out.println("String is:" +s);
	}
	
	public void m1(String s,int i) {
		System.out.println("String is:" +s);
		System.out.println("Int is:" +i);
	}
	
	

	public static void main(String[] args) {
		 Polymorphism p = new  Polymorphism();
		 p.m1();
		 p.m1("yogi",10);
		 p.m1(21,"yogi");
		 

	}

}

//output
//no arg
// String is:yogi
// Int is:10
// Int is:21
// String is:yogi
