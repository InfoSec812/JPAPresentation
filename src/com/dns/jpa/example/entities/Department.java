package com.dns.jpa.example.entities;

import com.dns.jpa.example.entities.Person;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Department
 *
 */
@Entity
@Table(name="departments")
public class Department implements Serializable {

	   
	@Id
	@GeneratedValue(generator="DEPT_SEQ", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize=1,name="DEPT_SEQ",sequenceName="dept_seq")
	private int index;

	private String name;
	
	private String description;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER, optional=true)
	@JoinColumn(name="index", referencedColumnName="manager")
	private Person manager;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="department")
	private List<Person> members = null ;
	
	private static final long serialVersionUID = 1L;

	public Department() {
		super();
	}   

	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}   
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	
	public Person getManager() {
		return this.manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(List<Person> members) {
		this.members = members;
	}

	/**
	 * @return the members
	 */
	public List<Person> getMembers() {
		return members;
	}
}
