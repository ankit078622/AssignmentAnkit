package com.clientrequirement;

public class Studententity {
private  int id;
 
private String name;
 private String rollno;
 private String course;
 private String session;
 private long phone;
 
 public Studententity(String name,String rollno,String course,String session,long phone)
 {
	 super();
	 this.name=name;
	 this.rollno=rollno;
	 this.course=course;
	 this.session=session;
	 this.phone=phone;
 }
 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
} 
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getSession() {
	return session;
}
public void setSession(String session) {
	this.session = session;
}

 
}
