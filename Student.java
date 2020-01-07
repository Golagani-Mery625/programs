package com.deloitte.thirdmvn.hibthird.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student 
{
	@Id
	int sid;
	String sname;
	String address;
	@ManyToMany(mappedBy="slist")
	List<Courses>  clist;
	public Student(){}
	public Student(int sid,String sname,String address)
	{
		this.sid=sid; this.sname=sname;  this.address=address;
	}
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the clist
	 */
	public List<Courses> getClist() {
		return clist;
	}
	/**
	 * @param clist the clist to set
	 */
	public void setClist(List<Courses> clist) {
		this.clist = clist;
	}
	
}
