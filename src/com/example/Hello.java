package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db = new Database();
		try {
			db.connect();
			System.out.println("connect db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot connect db");
			e.printStackTrace();
		}
		
		//insert data into table
		//db.save("C#",12000,"Khaing Khaing");
		
		try {
			// select data from table
			List<Student> list = db.getStudents();
			for(Student std:list) {
				System.out.println(std.getId()+":"+std.getStudentname()+":"+std.getCourse()+":"+std.getFee());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		try {
			db.getStudentById(3);
			System.out.println("get Id");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			db.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot close connection");
			e.printStackTrace();
		}
		
		Collection<Integer> num = new ArrayList();
		System.out.println("Before:"+num.size());
		num.add(15);
		num.add(20);
		num.add(25);
		num.add(30);
		System.out.println("After:"+num.size());
		
		//list interface
		List<String> animals = new ArrayList<>();
		animals.add("Cat");
		animals.add("Bird");
		animals.add("dog");
		System.out.println("animals list size:"+animals.size());
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(12);
		System.out.println(box1.get());
		
		Box<String> box2 = new Box<String>();
		box2.set("NNL");
		System.out.println(box2.get());
	
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter name: ");
//		String line = scanner.nextLine();
//		System.out.println(line);
		
		File file = new File("C:\\Users\\PC061\\Documents\\reason.txt");
		try {
			Scanner scanner = new Scanner(file);
			System.out.println("file exists");
			String line1= scanner.nextLine();
			String line2 = scanner.nextLine();
			System.out.println(line1);
			System.out.println(line2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}
		
		//generic interface
		Pair<String,String> pair = new CustomPair<>("mm","Myanmar");
		System.out.println(pair.getKey()+":"+pair.getValue());
		
		//generic methods
		Integer [] numbers = {12,23,45};
		String [] names = {"Ko Ko","Mg Mg","Aye Aye"};
		Util.<Integer>printAll(numbers);
		Util.<String>printAll(names);
		
		//collections
		Person person = getData();
		System.out.println(person.getAge()+":"+person.getName());
		
	}
	
	public static Person getData() {
		//fake Data
		String name = "Mg Mg";
		int age = 18;
		Person p = new Person(name,age);
		return p;
	}
	
	//methods
	public static void sayHello() {
		
		System.out.println("Hello");
	}
	
	//arguments with method
	public static void sayHi(String str, int age) {
		
		System.out.println("I say "+str+"\n Age: "+age);
	}

}

//generic methods
class Util {
	public static <T> void printAll(T[] array) {
		for(T a:array) {
			System.out.println(a);
		}
	}
}
