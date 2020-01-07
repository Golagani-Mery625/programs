package com.deloitte.thirdmvn.hibthird.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
@Entity
public class Courses 
{
  @Id
  int cid;
  String cname;
  int duration;
  @ManyToMany
  @JoinTable(name=" students_courses_reg",joinColumns={@JoinColumn(name="cid")},inverseJoinColumns={@JoinColumn(name=" sid")})
  List<Student> slist;
  public Courses(){}
  public Courses(int cid,String cname, int duration)
  {
	  this.cid=cid;  this.cname=cname;  this.duration=duration;
  }
/**
 * @return the cid
 */
public int getCid() {
	return cid;
}
/**
 * @param cid the cid to set
 */
public void setCid(int cid) {
	this.cid = cid;
}
/**
 * @return the cname
 */
public String getCname() {
	return cname;
}
/**
 * @param cname the cname to set
 */
public void setCname(String cname) {
	this.cname = cname;
}
/**
 * @return the duration
 */
public int getDuration() {
	return duration;
}
/**
 * @param duration the duration to set
 */
public void setDuration(int duration) {
	this.duration = duration;
}
/**
 * @return the slist
 */
public List<Student> getSlist() {
	return slist;
}
/**
 * @param slist the slist to set
 */
public void setSlist(List<Student> slist) {
	this.slist = slist;
}
  
}
