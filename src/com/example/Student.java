package com.example;

public class Student {

	private int id;
	private String studentname;
	private String course;
	private int fee;
	
	public Student(String studentname, String course, int fee) {
		super();
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}

	public Student(int id, String studentname, String course, int fee) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
}
