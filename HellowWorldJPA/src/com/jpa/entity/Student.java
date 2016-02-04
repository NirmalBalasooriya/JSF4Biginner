package com.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="Student")
public class Student {
	@Id
	@Column(name="studentid")
	int ID;
	@Column(name="firstName")
	String FirstName;
	@Column(name="lastName")
	String LastName;
	@Column(name="age")
	int Age;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", Age=" + Age + "]";
	}
	
}
