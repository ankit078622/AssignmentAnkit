package com.businesslogic;
//BU

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateutilpackage.*;
import com.clientrequirement.*;


public class Studentclasslogic {
static SessionFactory sessionFactory;
static Session sessionobject;
//add studennt
public Integer addstudent(String name,String rollno,String course,String session,long phoneno)
{
	Transaction tobj=null;
	Integer studentid=null;
	try
	{
		sessionobject=Hibernateutil.buildSessionFactory().openSession();
		tobj=sessionobject.beginTransaction();
		
		Studententity stuobj=new Studententity(name,rollno,course,session,phoneno);
		studentid=(Integer) sessionobject.save(stuobj);
		tobj.commit();
			
	}
	catch(HibernateException e)
	{
		if(tobj!=null) {
			tobj.rollback();
		}
			e.printStackTrace();
			
	}
	finally {
		sessionobject.close();
	}
	return studentid;
}
//list of student
//public void listofallstudent()
//{
//	 System.out.println("listof employee");
//	 Transaction tax=null;
//	 try
//	 {
//		 sessionobject.beginTransaction();
//		 List stuobj=sessionobject.createQuery("From Studententity").list();
//		 Iterator iterator=stuobj.iterator();
//		 while(iterator.hasNext())
//		 {
//			 Studententity stu1=(Studententity) iterator.next();
//			 System.out.println("name"+stu1.getName());
//			 System.out.println("rollno"+stu1.getRollno());
//			 System.out.println("course"+stu1.getCourse());
//			 System.out.println("session"+stu1.getSession());
//			 System.out.println("Phoneno"+stu1.getPhone());
//		 }
//		 tax.commit();
//		 
//	 }
//	 catch(HibernateException e)
//	 {
//		 if(tax!=null)
//		 tax.rollback();
//		 e.printStackTrace();
//	 }
//	 finally
//	 {
//		 sessionobject.close();
//	 }
//}
//

		
}