package com.java.Inheritance;

 
interface Home {
    public abstract void m1();
}

 
interface Car {
    public abstract void m1();
}

 
class DD implements Home, Car {
    public void m1() {
        System.out.println("m1() method from both Home and Car interfaces");
    }
}

public class Multiple {

    public static void main(String[] args) {
        // Create object of DD
        DD obj = new DD();
        obj.m1();  // Calling the method
    }

}
