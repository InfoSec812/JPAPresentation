package com.dns.jpa.example.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Table(name="people")
public class Person implements Serializable {

	   
	@Id
	@GeneratedValue(generator="PERSON_SEQ", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize=1,name="PERSON_SEQ", sequenceName="people_seq")
	private int index;

	@Column(nullable=false)
	private String forename;

	@Column(nullable=false)
	private String surname;
	
	@Column(name="streetaddr")
	private String streetAddress;
	
	private String city;
	
	@Column(length=2)
	private String state;
	
	@Column(name="postcode")
	private String postalCode;

	@ManyToOne(fetch=FetchType.EAGER, optional=true)
	@JoinColumn(name="department", referencedColumnName="index")
	private Department department = null ;

	@Column(nullable=false)
	private int age;
	
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	
	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}   
	
	public String getForename() {
		return this.forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}   
	
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}   
	
	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}   
	
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}   
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
   
}
