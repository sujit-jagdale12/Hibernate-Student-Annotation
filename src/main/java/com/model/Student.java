package com.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name = "Student_Id")
	private int id;
	@Column(name = "Student_Name")
	private String name;
	@Column(name = "Student_Email")
	private String email;
	@Column(name = "Student_Age")
	private int age;
	@Column(name = "Student_Branch")
	private String branch;

	public Student() {
	}

	public Student(int id, String name, String email, int age, String branch) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
