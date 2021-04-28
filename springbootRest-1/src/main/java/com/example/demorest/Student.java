package com.example.demorest;

public class Student {
	private int id;
	private String name;
	private int semester;
	private int average;
	
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
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", semester=" + semester + ", average=" + average + "]";
	}
	public Student(int id, String name, int semester, int average) {
		super();
		this.id = id;
		this.name = name;
		this.semester = semester;
		this.average = average;
	}
	
}
