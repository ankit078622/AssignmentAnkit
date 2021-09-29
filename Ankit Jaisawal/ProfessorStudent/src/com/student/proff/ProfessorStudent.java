package com.student.proff;
abstract class Person{

	int id;
	String name;
	int age;
	public Person(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	abstract void getDetails();
}

//Class for student
class Student extends Person{
	public Student(int id,String name,int age){
		super(id,name,age);
	}

	@Override
	void getDetails() {
		System.out.println("Student id: "+id);
		System.out.println("Student name : "+name);
		System.out.println("Student age : "+age);		
	}
}

//Classs For professor
class Professor extends Person{
	public Professor(int id,String name,int age) {
		super(id,name,age);
	}

	@Override
	void getDetails() {
		System.out.println("Professor id: "+id);
		System.out.println("Professor name : "+name);
		System.out.println("Professor age : "+age);
	}
}
public class ProfessorStudent {

	public static void main(String args[]) {
	
		//For student
		Person person1=new Student(1,"Amit",15);
		person1.getDetails();
		
		//For Professor
		Person person2=new Professor(101, "Mr. Ajeet", 33);
		person2.getDetails();
		
	}
}
