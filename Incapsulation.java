//class Student
package com.java.Incapsulation;                                                                                        
public class Student {
	
	private String name;
	private int roll_no;
	
	public String getName() {
		return name;
	}
	
	
	public int getRollno() {
		return roll_no;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
    public void setRollno(int roll_no) {
    	this.roll_no = roll_no;
		
	}
	
}

//class Student1
package com.java.Incapsulation;

public class  Student1{
		

		public static void main(String[] args) {
			
			Student s1 = new Student();
			s1.setName("Yogi");
			s1.setRollno(21);
			
			System.out.println("Name :" +s1.getName());
			System.out.println("Roll_no :" +s1.getRollno());

		}
	}
// create a two classes 
//1. Student
//2. Student1
//create a object of Student class in Student1.
// call class Student in class Student1.

