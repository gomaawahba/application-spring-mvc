package com.gomaa.servece;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.gomaa.Models.Student;
import com.sun.tools.javac.util.List;
@Service
public class Studentservece {
	
	private static int studentnumber=4;
	// database fake
	private static ArrayList<Student> students=new ArrayList<Student>();
	
	static {
		students.add(new Student(1,"gomaa","1-3-2003",true));
		students.add(new Student(2,"ahmed","3-9-2003",true));
		students.add(new Student(3,"mohmmed","5-8-2003",true));
		students.add(new Student(4,"ismail","6-7-2003",false));
		
	}
	
	public ArrayList<Student> readallstudent(){
		ArrayList<Student> student=new ArrayList<Student>();
		for(Student st:students) {
			
				student.add(st);
		}
	return student;
	}
	public void addstudent(int id,String name,String date,Boolean isactive) {
		students.add(new Student(++studentnumber,name,date,isactive));
	}
	public void deletstudent(int id) {
		Iterator<Student> iterator=students.iterator();
		while(iterator.hasNext());
		{
			Student student=iterator.next();
			if(student.getId()==id) {
				iterator.remove();
			}
		}
	}

}
