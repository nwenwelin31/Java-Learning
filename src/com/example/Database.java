package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private String url = "jdbc:mysql://localhost:3306/student";
	private String username = "root";
	private String password = "";
	private Connection conn;
	
	public void connect() throws SQLException {
		conn = DriverManager.getConnection(url,username,password);

	}
	
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
		
	}
	
	public void save(Student student) {
		String studentname = student.getStudentname();
		String course = student.getCourse();
		int fee = student.getFee();
		String sql = "insert into student (course,fee,studentname) values('"+course+"','"+fee+"','"+studentname+"')";
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("insert success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Student> getStudents() throws SQLException {
		String sql = "select * from student";
		Statement stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery(sql);
		List<Student> studentlist = new ArrayList<>();
		while(results.next()) {
			int id = results.getInt("id");
			String course = results.getString("course");
			int fee = results.getInt("fee");
			String studentname = results.getString("studentname");
			Student std = new Student(id, studentname, course, fee);
			studentlist.add(std);
//			System.out.println(id+":"+studentname+":"+course+":"+fee);
		}
		return studentlist;
	}
	
	public void updateStudent(Student student) {
		int id = student.getId();
		String studentname = student.getStudentname();
		String course = student.getCourse();
		int fee = student.getFee();
		String sql = "update student set name='"+studentname+"',course='"+course+"',fee='"+fee+"' where id='"+id+"'";
		System.out.println(sql);
	}
	
	public Student getStudentById(int id) throws SQLException {
		String sql = "select * from student where id="+id;
		Statement stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery(sql);
		Student student = null;
		if(results.next()) {
			String name = results.getString("studentname");
			String course = results.getString("course");
			int fee = results.getInt("fee");
			student = new Student(id,name,course,fee);
		}
		return student;
	}
}

