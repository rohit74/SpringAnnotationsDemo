/**
 * 
 */
/**
 * @author rohit
 *
 */
package com.kushal.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Profile
{
	public Student getStudent(){
		return student;
	}
	public void setStudent(Student student){
		this.student=student;
	}
	@Autowired
	private Student student;
	public Profile(){
		System.out.println("Inside profile Constructor");
	}
	public void printAge(){
		System.out.println("Age : " + student.getAge());
	}
	public void printName(){
		System.out.println("Name:"+ student.getName());
	}
}