package com.demo.beans;
import java.util.*;

public class Student {
	private String name;
	private int roll_number;
	private int marks;
	public Student() {
		name=null;
		roll_number=0;
		marks=0;
	}
	public Student(String name, int roll_number, int marks) {
		this.name = name;
		this.roll_number = roll_number;
		this.marks = marks;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if (marks>0)
		{
			this.marks = marks;
			
		}
		System.out.println("Marks below zero can not be added");
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_number=" + roll_number + ", marks=" + marks + "]";
	}

}
