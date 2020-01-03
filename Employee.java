package com.del.second.entity;

import java.sql.Date;

public class Employee 
{
	int eno;
	String name;
	double salary;
	Date doj;
	public Employee(){}
	public Employee(int eno,String name,double salary,Date doj)
	{
		this.eno=eno; this.name=name; this.salary=salary; this.doj=doj;
	}
	public int getEmpid() {
		return eno;
	}
	/**
	 * @param eno 
	 */
	public void setEmpid( int eno) {
		this.eno = eno;
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
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
