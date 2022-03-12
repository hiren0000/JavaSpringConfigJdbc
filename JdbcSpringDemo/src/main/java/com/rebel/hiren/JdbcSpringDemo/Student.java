package com.rebel.hiren.JdbcSpringDemo;

public class Student 
{
	private int id;
	private String name;
	private String Grade;
	

	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.Grade = grade;
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
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Grade=" + Grade + "]";
	}
	
	
	

}
