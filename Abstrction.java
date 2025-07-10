package Abstrction;

abstract class Car1{
	 public abstract void fueltype();
	 
	 public void color() {
		 System.out.println("color");
	 }
}

class tata extends Car1{
	public void fueltype() {
		 System.out.println("petrol");

  
  
  }
	
}

public class Abstraction {

	public static void main(String[] args) {
		tata t = new tata();
		t.color();
		t.fueltype();

	}

}

//output
//color
//petrol
