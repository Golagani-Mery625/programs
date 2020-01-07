package com.deloitte.thirdmvn.hibthird.entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Person 
{
	@Id
	String name;
	int age;
	String address;
	@OneToOne
	@JoinColumn(name="aid")
	AadharCard acard;
	public Person(){}
	public Person(String name,int age,String address,AadharCard acard)
	{
		super();
		this.name=name;
		this.age=age;
		this.address=address;
		this.acard=acard;
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
	 * @return the acard
	 */
	public AadharCard getAcard() {
		return acard;
	}
	/**
	 * @param acard the acard to set
	 */
	public void setAcard(AadharCard acard) {
		this.acard = acard;
	}
	
	
}