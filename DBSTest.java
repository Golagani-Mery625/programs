package com.del.entity;
import java.sql.Date;
import com.del.dao.StudentDAO;
public class DBSTest {

	public static void main(String[] args) 
	{
		StudentDAO ed=new StudentDAO();
		Student s=new Student(10,"meena",21,new Date(2020,11,14));
		Student s1=new Student(11,"mery",20,new Date(2019,10,12));
		if(ed.insertStudent(s1))
			System.out.println("insertion successfull");
		else
			System.out.println("insertion failed");
		
		/*if(ed.modifyStudent(s))
			System.out.println("modified succesfully");
		else
			System.out.println("modification failed");*/
		/*if(ed.removeStudent(10))
			System.out.println("removed successfully");
		else
			System.out.println("remove failed");*/
			

	}
}