package com.deloitte.firstmvn.hibfirst.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee
	{
	    @Id
		int eno;
	    @Column(name="ename")
		String name;
	    @Column(name="sal")
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
		
		public void setEmpid(int empno, int eno) {
			this.eno = eno;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public Date getDoj() {
			return doj;
		}
		
		public void setDoj(Date doj) {
			this.doj = doj;
		}

	}
