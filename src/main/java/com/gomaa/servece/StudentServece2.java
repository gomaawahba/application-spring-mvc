package com.gomaa.servece;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gomaa.Models.Student2;

import java.util.ArrayList;
import java.util.Iterator;
@Service
public class StudentServece2 {
	private static int studentNumber = 4;
	private static List<Student2> students = new ArrayList<Student2>();
	static {
		students.add(new Student2(1,"gomaa wahba", "14-06-1984" , true));
		students.add(new Student2(2,"Ahmed wahba", "24-03-1994" , true));
		students.add(new Student2(3,"Osama mohmmed", "10-12-1974" , true));
		students.add(new Student2(4,"Ali Walid", "01-01-1964" , true));
	}
	public List<Student2> readAllStudentd(){
		List<Student2> student = new ArrayList<Student2>();
		for(Student2 st : students) { 
				student.add(st); 
		}
		return student;
	}
	public void addStudent(String name, String date, boolean isActive) {
		students.add(new Student2(++studentNumber,name, date , isActive));
	}
	
	public void deleteStudent(int id) {
		Iterator<Student2> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student2 student = iterator.next();
			if(student.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public Student2 getstudentinfo(int id) {
		for(Student2 st:students) {
			if(st.getId()==id) {
				return st;
			}
		
		}	
		return null;
	}
	public void updata(int id,String name,String date,boolean isactive) {
		Iterator<Student2> iterator=students.iterator();
		while(iterator.hasNext()) {
			Student2 student=iterator.next();
			if(student.getId()==id) {
				student.setName(name);
				student.setDate(date);
				student.setActive(isactive);
			}
		}
	}
	

}
