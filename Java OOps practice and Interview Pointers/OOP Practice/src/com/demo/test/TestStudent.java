package com.demo.test;
import java.util.Scanner;
import com.demo.beans.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		
		System.out.println("Enter the name of the Student");
		String name=sc.nextLine();
		System.out.println("Enter roll number");
		int roll_number=sc.nextInt();
		System.out.println("Enter marks of the Student");
		int marks=sc.nextInt();
		
		s.setName(name);
		s.setRoll_number(roll_number);
		s.setMarks(marks);

		
		System.out.println("<-------------Here is my very first encapsulation program here--------->");
//		System.out.println("Name: " + s.getName());
//		System.out.println("Roll Number: " + s.getRoll_number());
//		System.out.println("Marks secured" + s.getMarks());
		System.out.println(s);
	}

}
