package com.clientrequirement;

import java.util.ArrayList;
import java.util.List;

import com.businesslogic.Studentclasslogic;

public class UserInterface {
 public static void main(String[] args)
 {
	Studentclasslogic studentclasslogic=new  Studentclasslogic();
    Integer store=studentclasslogic.addstudent("Heman", "26", "Bca", "2011", 33423334);
//    			  studentclasslogic.addstudent("Jyoti", "34", "btech", "2008", 3343333);
//    			  studentclasslogic.addstudent("saket", "14", "be", "1001", 7733333);
//    			  studentclasslogic.addstudent("tiger", "22", "be", "208", 223333);
    			  
    			  List <Integer> insert=new ArrayList <Integer>();
    				insert.add(store);
    				
    				if(insert.size()!=0)
    				{
    					System.out.println("Recors are inserted");
    				//	System.out.println(insert);
    				}
    				else
    				{
    					System.out.println("Recors are not inserted");
    				}
    					  
    			  
 }
}

