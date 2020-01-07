package com.deloitte.thirdmvn.hibthird.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Department 
{
   @Id
   int deptno;
   String dname;
   @OneToMany(mappedBy="dept")
   List<Employee>elist;
   public Department(){}
   public Department(int deptno,String dname,List<Employee> elist)
   {
	   this.deptno=deptno;  this.dname=dname;  this.elist=elist;
   }
/**
 * @return the deptno
 */
public int getDeptno() {
	return deptno;
}
/**
 * @param deptno the deptno to set
 */
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
/**
 * @return the dname
 */
public String getDname() {
	return dname;
}
/**
 * @param dname the dname to set
 */
public void setDname(String dname) {
	this.dname = dname;
}
/**
 * @return the elist
 */
public List<Employee> getElist() {
	return elist;
}
/**
 * @param elist the elist to set
 */
public void setElist(List<Employee> elist) {
	this.elist = elist;
}
   
}
