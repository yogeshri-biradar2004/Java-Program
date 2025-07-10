package com.java.contractor;

public class Student {
	//field
	String name;
	int rollno;
	int age;
	
	//contractor - parameterized
	public Student(String name, int rollno,int age) {
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("yogi", 21,20);
		
		System.out.println("Student Details");
		System.out.println("Nmae : " +s1.name);
		System.out.println("Rollno : " +s1.rollno);
		System.out.println("Age : " +s1.age);
		
		
	}

}

//output
// Student Details
// Nmae : yogi
// Rollno : 21
// Age : 20
