package com.del.courses.entity;

public class Courses 
{
	int course_id;
	String course_name;
	int course_duration;
	double course_fee;
   public Courses(){}
   public Courses(int course_id,String course_name,int course_duration,double course_fee)
   {
	   this.course_id=course_id;
	   this.course_name=course_name;
	   this.course_duration=course_duration;
	   this.course_fee=course_fee;
   }
/**
 * @return the course_id
 */
public int getCourse_id() {
	return course_id;
}
/**
 * @param course_id the course_id to set
 */
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
/**
 * @return the course_name
 */
public String getCourse_name() {
	return course_name;
}
/**
 * @param course_name the course_name to set
 */
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
/**
 * @return the course_duration
 */
public int getCourse_duration() {
	return course_duration;
}
/**
 * @param course_duration the course_duration to set
 */
public void setCourse_duration(int course_duration) {
	this.course_duration = course_duration;
}
/**
 * @return the course_fee
 */
public double getCourse_fee() {
	return course_fee;
}
/**
 * @param course_fee the course_fee to set
 */
public void setCourse_fee(double course_fee) {
	this.course_fee = course_fee;
}
   
}
