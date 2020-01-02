package com.del.entity;

import java.sql.Date;

public class Student
{
	int rno;
	String name;
	int age;
	Date doj;
public  Student(int rno,String name,int age,Date  doj)
{
	this.rno=rno; this.name=name; this.age=age; this.doj= doj;
	}
/**
 * @return the rno
 */
public int getRno() {
	return rno;
}
/**
 * @param rno the rno to set
 */
public void setRno(int rno) {
	this.rno = rno;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the doj
 */
public Date getDoj() {
	return doj;
}
/**
 * @param doj the doj to set
 */
public void setDoj(Date doj) {
	this.doj = doj;
}

}